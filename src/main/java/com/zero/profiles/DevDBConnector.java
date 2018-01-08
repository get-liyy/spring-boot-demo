package com.zero.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by liyanyong on 2017/12/22.
 * 测试数据库
 */
@Component
@Profile("devDB")
public class DevDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("Devdb");
    }
}
