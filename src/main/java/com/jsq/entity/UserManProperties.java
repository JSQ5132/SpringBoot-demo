package com.jsq.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类描述：实体
 * @author 蒋圣强
 * @date 2018/1/27.
 */
@Component
@ConfigurationProperties(prefix = "userMan")
public class UserManProperties {
    private String nickName;
    private String sex;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
