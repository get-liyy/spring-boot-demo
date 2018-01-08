package com.zero.controller;

import com.zero.domain.UserInfo;
import com.zero.domain.UserLoginInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liyanyong on 2017/12/21.
 */
@RestController
@RequestMapping(value="/users")
public class ZeroRestController {

    @RequestMapping(value = "/{user}", method =  RequestMethod.GET)
    public UserLoginInfo getUserLoginInfo(@PathVariable Long user) {

        return null;
    }

    @RequestMapping(value = "/{user}/userinfo", method = RequestMethod.GET)
    public List<UserInfo> getUserInfo(@PathVariable Long user) {

        return null;
    }

    @RequestMapping(value = "/{user}", method =  RequestMethod.DELETE)
    public UserLoginInfo deleteUserLoginInfo(@PathVariable Long user) {

        return null;
    }
}
