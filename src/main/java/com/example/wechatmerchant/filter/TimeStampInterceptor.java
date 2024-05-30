package com.example.wechatmerchant.filter;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.Instant;
import java.util.Properties;

@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
})
@Component
public class TimeStampInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        Object parameter = invocation.getArgs()[1];

        if (parameter == null) {
            return invocation.proceed();
        }
        Long nowTime = Instant.now().toEpochMilli();
        // 检查操作类型
        if (mappedStatement.getSqlCommandType() == SqlCommandType.INSERT) {
            // 插入操作的处理
            // 设置创建时间和更新时间 通过父类查找时间字段
            Method setCreateTime = parameter.getClass().getMethod("setCtime", Long.class);
            Method setUpdateTime = parameter.getClass().getMethod("setMtime", Long.class);
            setCreateTime.invoke(parameter, nowTime);
            setUpdateTime.invoke(parameter, nowTime);
        } else if (mappedStatement.getSqlCommandType() == SqlCommandType.UPDATE) {
            // 更新操作的处理
            // 例如，修改参数对象，排除创建时间字段的更新
            // 设置创建时间和更新时间 通过父类查找时间字段
            Method setUpdateTime = parameter.getClass().getMethod("setMtime", Long.class);
            setUpdateTime.invoke(parameter, nowTime);
        }

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        // 可以在这里读取配置文件中的属性
    }
}
