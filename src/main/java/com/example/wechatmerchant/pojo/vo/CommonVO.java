package com.example.wechatmerchant.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CommonVO {

    @Data
    @NoArgsConstructor
    public static class Session {

        @JsonProperty("openid")
        private String openId;

        @JsonProperty("session_key")
        private String sessionKey;
    }

    @Data
    @NoArgsConstructor
    public static class WeChatCommonRsp {

        @JsonProperty("errcode")
        private Integer errCode;

        @JsonProperty("errmsg")
        private String errMsg;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CommonRsp {

        @JsonProperty("error_code")
        private Integer errorCode;

        @JsonProperty("error_msg")
        private String errorMsg;
    }
}
