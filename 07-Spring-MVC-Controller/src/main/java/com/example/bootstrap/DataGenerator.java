package com.example.bootstrap;

import com.example.model.Student;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Student> createStudent() {
        List<Student> students = Arrays.asList(
                new Student(1, "Mike", "Smith"),
                new Student(2, "John", "Doe"),
                new Student(3, "James", "Brown")
        );
        return students;
    }
}
