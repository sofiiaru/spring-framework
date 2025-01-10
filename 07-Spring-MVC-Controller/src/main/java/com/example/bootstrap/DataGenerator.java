package com.example.bootstrap;

import com.example.model.Employee;
import com.example.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployees() {
        return employeeList;
    }

    public static List<Student> createStudent() {
        List<Student> students = Arrays.asList(
                new Student(1, "Mike", "Smith"),
                new Student(2, "John", "Doe"),
                new Student(3, "James", "Brown")
        );
        return students;
    }
}
