package com.oAuth.demoAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController6 {

    @GetMapping("/public")   //lofin not required
    public String test() {
        return "Public Endpoint";
    }

    @GetMapping("loginn")    //by using google cloud console , add url : http://localhost:8080/login/oauth2/code/google
    public String login(){
        return "logged in";
    }

    @GetMapping("privatee")
    private String logg(){
        return "authorized";
    }
}