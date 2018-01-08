package com.zero.controller;

import com.zero.domain.ZeroResouce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyanyong on 2017/12/25.
 */
@Controller
@RequestMapping("/zero")
public class ZeroResourceController {

    @RequestMapping("/html")
    public ModelAndView index() {
        List<ZeroResouce> zeroList = new ArrayList<ZeroResouce>();
        ZeroResouce bean = new ZeroResouce("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        zeroList.add(bean);
        bean = new ZeroResouce("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        zeroList.add(bean);
        bean = new ZeroResouce("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
        zeroList.add(bean);
        bean = new ZeroResouce("嘟嘟MD独立博客","Spring Boot干货系列 ","http://tengj.top/");
        zeroList.add(bean);
        bean = new ZeroResouce("后端编程嘟","Spring Boot教程和视频 ","http://www.toutiao.com/m1559096720023553/");
        zeroList.add(bean);
        bean = new ZeroResouce("程序猿DD","Spring Boot系列","http://www.roncoo.com/article/detail/125488");
        zeroList.add(bean);
        bean = new ZeroResouce("纯洁的微笑","Sping Boot系列文章","http://www.ityouknow.com/spring-boot");
        zeroList.add(bean);
        bean = new ZeroResouce("CSDN——小当博客专栏","Sping Boot学习","http://blog.csdn.net/column/details/spring-boot.html");
        zeroList.add(bean);
        bean = new ZeroResouce("梁桂钊的博客","Spring Boot 揭秘与实战","http://blog.csdn.net/column/details/spring-boot.html");
        zeroList.add(bean);
        bean = new ZeroResouce("林祥纤博客系列","从零开始学Spring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        zeroList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/template");
        modelAndView.addObject("zeroList", zeroList);
        return modelAndView;
    }

    @RequestMapping("/jsp")
    public ModelAndView indexJsp() {
        List<ZeroResouce> zeroList = new ArrayList<ZeroResouce>();
        ZeroResouce bean = new ZeroResouce("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        zeroList.add(bean);
        bean = new ZeroResouce("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        zeroList.add(bean);
        bean = new ZeroResouce("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
        zeroList.add(bean);
        bean = new ZeroResouce("嘟嘟MD独立博客","Spring Boot干货系列 ","http://tengj.top/");
        zeroList.add(bean);
        bean = new ZeroResouce("后端编程嘟","Spring Boot教程和视频 ","http://www.toutiao.com/m1559096720023553/");
        zeroList.add(bean);
        bean = new ZeroResouce("程序猿DD","Spring Boot系列","http://www.roncoo.com/article/detail/125488");
        zeroList.add(bean);
        bean = new ZeroResouce("纯洁的微笑","Sping Boot系列文章","http://www.ityouknow.com/spring-boot");
        zeroList.add(bean);
        bean = new ZeroResouce("CSDN——小当博客专栏","Sping Boot学习","http://blog.csdn.net/column/details/spring-boot.html");
        zeroList.add(bean);
        bean = new ZeroResouce("梁桂钊的博客","Spring Boot 揭秘与实战","http://blog.csdn.net/column/details/spring-boot.html");
        zeroList.add(bean);
        bean = new ZeroResouce("林祥纤博客系列","从零开始学Spring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        zeroList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/indexJsp");
        modelAndView.addObject("zeroList", zeroList);
        return modelAndView;
    }
}
