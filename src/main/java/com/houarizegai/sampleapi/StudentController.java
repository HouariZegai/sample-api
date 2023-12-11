package com.houarizegai.sampleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Houari ZEGAI", "contact@houarizegai.com"),
                new Student(2L, "Sid Ahmed Lamine", "sid@houarizegai.com")
        );
    }
}

record Student (Long id, String name, String email) {
}
