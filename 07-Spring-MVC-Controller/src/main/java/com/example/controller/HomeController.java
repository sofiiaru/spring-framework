package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// annotate the class with @Controller stereotype annotation
public class HomeController {

    @RequestMapping("/home")// to associate the action with http requested path
    public String home() {
        return "home.html";//return HTML document that contains details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome.html";
    }

    @RequestMapping//("/")-optional, will be default
    public String welcome2() {
        return "welcome.html";
    }

}
