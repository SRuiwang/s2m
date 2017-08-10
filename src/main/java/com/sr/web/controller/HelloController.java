package com.sr.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * test hello controller
 * Created by shaorui on 2017/8/10.
 */
@Controller
@RequestMapping("/say")
public class HelloController {
    Logger log = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String sayHello() {
        log.info("com.sr.web.controller.Hello.sayHello->say hello");
        return "hello";
    }
}
