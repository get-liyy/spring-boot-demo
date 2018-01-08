package com.zero.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by liyanyong on 2017/12/21.
 */
@Configuration
@ConfigurationProperties(prefix="com.one")
@PropertySource("classpath:zero.properties")
public class ConfigTestBean {
    private String name;
    private String want;

    public String getName() {
        return name;
    }

    public String getWant() {
        return want;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
