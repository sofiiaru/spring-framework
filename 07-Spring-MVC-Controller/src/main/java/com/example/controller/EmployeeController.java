package com.example.controller;

import com.example.bootstrap.DataGenerator;
import com.example.bootstrap.StateGenerator;
import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("states", StateGenerator.getAllStates());

        return "employee/employee-create";
    }

    @PostMapping("/list")
    public String employeeList(/* @Valid */ @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            return "employee/employee-create";
        }

        DataGenerator.saveEmployee(employee);

        model.addAttribute("employees", DataGenerator.readAllEmployees());
        return "employee/employee-list";
    }
}
