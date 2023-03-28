package com.whq.whqinterface.controller;

import com.whq.whqclientsdk.model.User;
import com.whq.whqclientsdk.utils.SignUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: whq
 * @description:
 * @time: 2023/3/21 20:33
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @Value("${whq-api.client.secret-key}")
    private String secretKey;

    @GetMapping("/")
    public String getNameByGet(String name){
        return "Get 的名字是" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "Post 的名字是" + name;
    }

    @PostMapping("/user")
    public String getNameByPost(@RequestBody User user, HttpServletRequest request){
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String body = request.getHeader("body");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        if (!accessKey.equals("whqapi")) {
            throw  new RuntimeException("无权限");
        }
//        if (Long.parseLong(nonce) > 10000) {
//            throw  new RuntimeException("无权限");
//        }
        // todo 校验once 校验时间戳和当前时间不能超过5min
        // todo 通过getSign方法获取相sk，与数据库里面的sk对比，相同则通过，反之失败
        // 第二次计算
        // 默认为
        String serverSign = SignUtils.getSign(body, secretKey);
        if (!serverSign.equals(sign)) {
            throw  new RuntimeException("无权限");
        }
        String result = "Post 的名字是" + user.getUsername();
        return result;
    }
}
