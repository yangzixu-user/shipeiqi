package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/show")
    public String  showPage(){
        System.out.println("index1.....");
        for (int i = 1; i <1315 ; i++) {
            System.out.println(i+"我爱你");
            //TODO
        }
        return "index1";
    }
}

