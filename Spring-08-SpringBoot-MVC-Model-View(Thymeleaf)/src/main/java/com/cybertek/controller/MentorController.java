package com.cybertek.controller;

import com.cybertek.enums.Gender;
import com.cybertek.model.Mentor;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Alim","Amat",32, Gender.MALE));
        mentorList.add(new Mentor("Kurabn","Sadakat",35, Gender.MALE));
        mentorList.add(new Mentor("Zilnaz","Meradel",21, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";

    }

}
