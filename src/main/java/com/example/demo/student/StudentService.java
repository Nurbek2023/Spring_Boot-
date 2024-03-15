package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public static List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Nurbek",
                        "nurbek.mamasaliev2905@gmail.com",
                        LocalDate.of(2004, Month.MAY,29),
                        20
                )

        );
    }
}
