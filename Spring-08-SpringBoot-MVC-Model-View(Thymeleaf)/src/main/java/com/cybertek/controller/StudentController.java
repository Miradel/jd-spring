package com.cybertek.controller;

import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("welcome")
    public String homePage(Model model){

        model.addAttribute("name","Meradel");
        model.addAttribute("gender","Male");
        model.addAttribute("country","East Turkestan");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        // Create some random StudentID and show ot on your UI
        int ranNum = new Random().nextInt(10000);
        model.addAttribute("id",ranNum);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(12);
        numbers.add(76);
        numbers.add(101);
        model.addAttribute("numbers",numbers);

        LocalDate birthday = LocalDate.now().minusYears(30);
        model.addAttribute("birthDate", birthday);

        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){

        return "student/register";
    }

}
