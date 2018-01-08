package com.zero.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by liyanyong on 2017/12/21.
 */
@ConfigurationProperties(prefix="com.zero")
public class ConfigBean {
    private String name;
    private String want;
    private String total;

    public String getName() {
        return name;
    }

    public String getWant() {
        return want;
    }

    public String getTotal() {
        return total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
