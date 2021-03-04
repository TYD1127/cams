package com.winsoar.cams.login.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.winsoar.cams.dao.UserMapper;
import com.winsoar.cams.pojo.User;
import com.winsoar.cams.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author TangYaD
 * @Date 2020/12/25 17:33
 * @Version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String toLogin(User user) {
        JSONObject json = new JSONObject();
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        try {
            User user1 = userMapper.selectByUsername(user.getUsername());
            if (user1 != null) {
                String dbPassWord = user1.getPassword();
                if (bCryptPasswordEncoder.matches(user.getPassword(), dbPassWord)) {
                    //创建token
                    String token = JwtUtil.generateToken(user1);
                    json.put("success", true);
                    json.put("code", 1);
                    //json.put("result", user1);
                    json.put("time", new Date());
                    json.put("message", "登陆成功");
                    json.put("url", "/success");
                    System.out.println(token);
                    json.put(JwtUtil.AUTHORIZATION, token);
                } else {
                    json.put("success", false);
                    json.put("code", -1);
                    json.put("message", "登陆失败,密码错误");
                }
            } else {
                json.put("success", false);
                json.put("code", 0);
                json.put("message", "无此用户信息");
            }
        } catch (Exception e) {
            json.put("code", -2);
            json.put("success", false);
            json.put("message", e.getMessage());

        }
        return JSON.toJSONString(json);
    }


    @ResponseBody
    @RequestMapping(value = "/mlogin", method = RequestMethod.POST)
    public String toMLogin(User user) {
        JSONObject json = new JSONObject();
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        try {
            User user1 = userMapper.selectByUsername(user.getUsername());
            if (user1 != null) {
                String dbPassWord = user1.getPassword();
                if (bCryptPasswordEncoder.matches(user.getPassword(), dbPassWord)) {
                    //创建token
                    String token = JwtUtil.generateToken(user1);
                    json.put("status", true);
                    json.put("code", 1);
                    json.put("message", "登陆成功");
                    json.put("userInfo",user1);
                    json.put(JwtUtil.AUTHORIZATION, token);
                } else {
                    json.put("status", false);
                    json.put("code", 2);
                    json.put("message", "登陆失败,密码错误");
                }
            } else {
                json.put("status", false);
                json.put("code", 0);
                json.put("message", "用户不存在");
            }
        } catch (Exception e) {
            json.put("status", false);
            json.put("code", -1);
            json.put("status", false);
            json.put("message", e.getMessage());

        }
        return JSON.toJSONString(json);
    }

}
