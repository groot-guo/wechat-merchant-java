package com.example.wechatmerchant.controllers;


import com.example.wechatmerchant.pojo.vo.CommonVO;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.wechatmerchant.pojo.vo.UserVO;
import com.example.wechatmerchant.service.UserService;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/user/{openId}")
    public UserVO.UserInfoRsp getUser(@PathVariable String openId) {
        return userService.getUserById(openId);
    }

    @PostMapping("/api/user/register")
    public CommonVO.CommonRsp registerUser(@RequestBody @Validated UserVO.RegisterUserReq userReq) {
        return userService.registerUser(userReq);
    }

    @PostMapping("/api/user/login")
    public CommonVO.CommonRsp login(@RequestBody @Validated UserVO.UserLoginReq userLoginReq) {
        // validate req todo
        return userService.login(userLoginReq);
    }

    @PostMapping("/api/test/check_session")
    public UserVO.UserResp checkSession(@RequestBody @Validated UserVO.CheckUserSessionReq checkSessionReq) {
        boolean isExisted =  userService.checkUserSession(checkSessionReq);
        if (isExisted) {
            return new UserVO.UserResp(0, "ok");
        }
        return new UserVO.UserResp(-1, "fail");
    }

}
