package com.yupi.yuapiinterface.controller;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yupi.yuapiinterface.model.User;
import com.yupi.yuapiinterface.service.UserService;
import com.yupi.yuapiinterface.utils.SignUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name, HttpServletRequest request) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
//        String sign = request.getHeader("sign");
//        String accessKey = request.getHeader("accessKey");
//        //根据accessKey查询数据库得到
//        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(StringUtils.hasText(accessKey), User::getAccessKey, accessKey);
//        User requestUser = userService.getOne(queryWrapper);
//        if (requestUser == null) {
//            throw new RuntimeException("非法请求");
//        }
//        String secretKey = requestUser.getSecretKey();
//        String data = JSONUtil.toJsonStr(user) + secretKey;
//        boolean verify = SignUtil.verify(data, sign);
//        if (!verify) {
//            throw new RuntimeException("no authority");
//        }
        return "POST 用户名字是" + user.getUserName();
    }
}
