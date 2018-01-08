package com.zero.controller;

import com.zero.domain.UserInfo;
import com.zero.profiles.ConfigBean;
import com.zero.profiles.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyanyong on 2017/12/21.
 */
@RestController
public class ZeroController {

    @Autowired
    ConfigBean configBean;

    @Autowired
    ConfigTestBean configTestBean;

    @Value("${one.number.less.than.ten}")
    private Integer onltt;

    @Value("${one.secret}")
    private String secret;

    @Value("${one.number}")
    private String number;

    @Value("${one.bignumber}")
    private String bignumber;

    @Value("${one.uuid}")
    private String uuid;

    @Value("${one.number.in.range}")
    private String onir;

    @Value("${test.serverinfo.dburl}")
    private String tsd;

    @RequestMapping("/value")
    public String index() {
        StringBuffer sBuff = new StringBuffer();
        sBuff.append("cbName【").append(configBean.getName()).append("】").append("<br/>");
        sBuff.append("cbWant【").append(configBean.getWant()).append("】").append("<br/>");
        sBuff.append("cbTotal【").append(configBean.getTotal()).append("】").append("<br/>");
        sBuff.append("ctbName【").append(configTestBean.getName()).append("】").append("<br/>");
        sBuff.append("ctbWant【").append(configTestBean.getWant()).append("】").append("<br/>");
        sBuff.append("值onltt【").append(onltt).append("】").append("<br/>");
        sBuff.append("值secret【").append(secret).append("】").append("<br/>");
        sBuff.append("值number【").append(number).append("】").append("<br/>");
        sBuff.append("值bignumber【").append(bignumber).append("】").append("<br/>");
        sBuff.append("值uuid【").append(uuid).append("】").append("<br/>");
        sBuff.append("值onir【").append(onir).append("】").append("<br/>");
        sBuff.append("值tsd【").append(tsd).append("】").append("<br/>");

        return sBuff.toString();
    }

    /*@RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map =new HashMap<String,Object>();
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        if(!userName.equals("") && password!=""){
            UserInfo user = new UserInfo(userName,password);
            request.getSession().setAttribute("user",user);
            map.put("result","1");
        }else{
            map.put("result","0");
        }
        return map;
    }*/
}
