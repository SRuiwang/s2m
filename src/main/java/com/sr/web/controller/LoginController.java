package com.sr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("dologin.do")
    public String doLogin(){
        return "redirect:main.do";
    }

    @RequestMapping("main.do")
    public String forwardMain(){
        return "mainJsp";
    }

}