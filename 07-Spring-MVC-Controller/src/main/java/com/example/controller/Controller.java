package com.example.controller;

import com.example.model.Student;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/template")
    public String homePage(Model model) {

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");


        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);
        return "stu";
    }
}
