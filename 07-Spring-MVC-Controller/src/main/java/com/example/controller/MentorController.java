package com.example.controller;

import com.example.enums.Gender;
import com.example.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @RequestMapping("/list")
    public String showTable(Model model) {
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Tom", "Hanks", 38, Gender.MALE));
        mentorList.add(new Mentor("Ammy", "Bryan", 33, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("mentor", new Mentor());
        return "mentor/register";
    }

    @PostMapping("/confirm")
    public String showForm2(@ModelAttribute("mentor") Mentor mentor) {

        return "mentor/confirmation";
        //return "redirect:/mentor/register";
    }
}
