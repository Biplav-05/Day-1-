package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class Controller {

    @GetMapping
    public List<Student> getData()
    {
        return Arrays.asList(new Student(
                1L,
                "Biplav",
                "biplav413@gmail.com",
                LocalDate.of(1998, Month.APRIL, 05),
                24
        ));
    }
}
