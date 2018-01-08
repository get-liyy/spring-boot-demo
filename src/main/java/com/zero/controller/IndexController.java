package com.zero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/** 主页
 * Created by liyanyong on 2017/12/26.
 */
@Controller
public class IndexController extends  AbstractController {

    @RequestMapping("/main")
    public String main(Model model) {
        model.addAttribute("ctx", getContextPath()+"/");
        return "main";
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("ctx", getContextPath()+"/");
        return "index";
    }

    public static void main(String[] args) {
        System.out.println("ff对对对");
    }
}
