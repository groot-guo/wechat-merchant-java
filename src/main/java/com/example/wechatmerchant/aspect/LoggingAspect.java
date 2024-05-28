package com.example.wechatmerchant.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


// todo 有待调整
@Slf4j
@Aspect
@Component
public class LoggingAspect {

    // 在执行WeChatService的每个方法前后执行: 所有方法执行打印，此处public 只定义公有方法调用返回，改为 *
    @Around("execution(* com.example.wechatmerchant.service.WeChatService.*(..))")
    public Object doLogging(ProceedingJoinPoint pjp) throws Throwable {
        System.err.println("[Around] start " + pjp.getSignature());
        Object retVal = pjp.proceed();
        System.err.println("[Around] done " + pjp.getSignature());
        return retVal;
    }

    // 定义切点，这里以特定的方法为例
    // 私有方法调用时，没有被使用的
    @Pointcut("@annotation(Loggable)")
    public void loggableMethods() {}

    @Before("loggableMethods()")
    public void logMethodCall(JoinPoint joinPoint) {
        // 打印方法名和入参
        System.out.println(joinPoint.getSignature().getName() + " called with: " + Arrays.toString(joinPoint.getArgs()));
        log.info(joinPoint.getSignature().getName() + " called with: " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "loggableMethods()", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result) {
        // 打印方法名和出参
        System.out.println(joinPoint.getSignature().getName() + " returned with: " + result);
        log.info(joinPoint.getSignature().getName() + " returned with: " + result);
    }
}
