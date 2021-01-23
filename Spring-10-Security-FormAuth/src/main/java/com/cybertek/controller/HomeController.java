package com.cybertek.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping(value = {"/login","/"})
    public String login(){
        return "login";
    }
}
