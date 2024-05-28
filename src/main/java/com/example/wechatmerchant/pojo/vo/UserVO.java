package com.example.wechatmerchant.pojo.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserVO {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RegisterUserReq {

        private String openId;

        private String nickName;

        private String phone;

        private String avatarUrl;
    }

    @Data
    @AllArgsConstructor
    public static class UserResp {

        private Integer code;

        private String msg;
    }

    @Data
    @AllArgsConstructor
    public static class UserLoginReq {
        private String openId;
        private String sessionKey;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor // post 请求创建需要 无参构造函数初始化
    public static class CheckUserSessionReq {
        @JsonProperty("openid")
        private String openId;


        private String sessionKey;
    }

}
