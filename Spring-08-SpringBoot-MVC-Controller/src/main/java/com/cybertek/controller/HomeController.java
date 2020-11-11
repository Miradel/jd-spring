package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping
    public String getRequestMapping(){
        return "Home";
    }

    /*
        @RequestMapping(method = RequestMethod.GET, value = "/miradel")
    public String getRequestMapping2(){
        return "Home";
    }
    Bellow is the shortcut for this method :
     */

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/miradel")
    public String getRequestMapping3(){
        return "Home";
    }

    @PostMapping("/spring")
    public String postMappingEx(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("Name is :"+name);
        return "home";
    }

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("Course is :" + course);
        return "home";

        /*
        need to run it on the browser like this :
        http://localhost:8080/home/course?course=Spring
         */
    }

    @GetMapping(value = "home/course2")
    public String requestParam2(@RequestParam(value = "course2",required = false,defaultValue = "Cybertek")String name){
        System.out.println("Name2 is :" + name);
        return "home";
    }

}
