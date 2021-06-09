package com.joshua.intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    @GetMapping("/hello")
    public String sayHello () {

        String msg = "hello Spyderkim ! \r\n" +
                "I love you :)";
        return msg;

    }
}
