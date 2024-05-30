package com.example.wechatmerchant.pojo.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
public class UserVO {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RegisterUserReq {
        @JsonProperty("openid")
        private String openId;

        @JsonProperty("nickname")
        private String nickName;

        private String phone;

        @JsonProperty("avatar_url")
        private String avatarUrl;
    }

    @Data
    @AllArgsConstructor
    public static class UserResp {

        private Integer code;

        private String msg;
    }

    @EqualsAndHashCode(callSuper = true)
    @Data
    @NoArgsConstructor
    public static class UserLoginReq extends CommonVO.Session {}

    @EqualsAndHashCode(callSuper = true)
    @Data
    @NoArgsConstructor // post 请求创建需要 无参构造函数初始化
    public static class CheckUserSessionReq extends CommonVO.Session {}

    @EqualsAndHashCode(callSuper = false)
    @Data
    @NoArgsConstructor
    public static class UserInfoRsp extends CommonVO.CommonRsp {
        @JsonProperty("openid")
        private String openId;

        @JsonProperty("nickname")
        private String nickName;

        private String phone;

        @JsonProperty("avatar_url")
        private String avatarUrl;
    }
}
