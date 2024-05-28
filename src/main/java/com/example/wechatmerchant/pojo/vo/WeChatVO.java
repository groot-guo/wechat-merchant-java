package com.example.wechatmerchant.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class WeChatVO {

    @Data
    @AllArgsConstructor
     public static class AccessTokenReq {

        private String appId;

        private String appSecret;

        private String grantType;
     }

    @Data
    @NoArgsConstructor
    public static class AccessTokenResp {

        @JsonProperty("errcode")
        private Integer errCode;

        @JsonProperty("errmsg")
        private String errMsg;

        @JsonProperty("access_token")
        private String accessToken;

        @JsonProperty("expires_in")
        private Integer expiresIn;
    }

     @Data
     @AllArgsConstructor
     public static class UserOpenIdReq {

        private String accessToken;

        private Integer code;
     }

     @Data
     @AllArgsConstructor
     public static class UserOpenIdResp {

        private String errCode;

        private String errMsg;

        private String openPid;
     }

     @Data
     @AllArgsConstructor
     public static class CheckSessionReq {

        private String openid;

        private String sessionKey;
     }

     @Data
     @AllArgsConstructor
     public static class CheckSessionResp {
        private Integer errCode;

        private String errMsg;
     }

}
