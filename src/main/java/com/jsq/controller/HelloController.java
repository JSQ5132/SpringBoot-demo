package com.jsq.controller;

import com.jsq.entity.UserManProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：SrpingBoot的HelloWord程序
 * @author 蒋圣强
 * @date 2018/1/27.
 */
@RestController
public class HelloController {

    /**
     *通过 @Value("${**}") 注解将配置文件中对应的值注入到该属性中来了
     */
    @Value("${userNames}")
    private String userNames;

    @Value("${nickName}")
    private String nickName;

    @Value("${user}")
    private String user;


    @Autowired
    private UserManProperties userManProperties;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!  用户："+user+"你好！";
    }

    @RequestMapping(value = "/user" ,method = RequestMethod.GET)
    public String user(){
        return "用户昵称："+userManProperties.getNickName()+",用户性别："+userManProperties.getSex();
    }
}
