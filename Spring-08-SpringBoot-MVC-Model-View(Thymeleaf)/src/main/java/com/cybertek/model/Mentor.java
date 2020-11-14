package com.cybertek.model;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Controller
public class Mentor {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

}
