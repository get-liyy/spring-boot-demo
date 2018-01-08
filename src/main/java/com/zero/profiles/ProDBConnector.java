package com.zero.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by liyanyong on 2017/12/22.
 * 生产数据库
 */
@Component
@Profile("proDB")
public class ProDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("Prodb");
    }
}
