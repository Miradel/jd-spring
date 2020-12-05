package com.cybertek.controller;

import com.cybertek.dataGenerator.DataGenerator;
import com.cybertek.model.Employee;
import com.cybertek.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.Arrays;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String emploeeCreate(Model model){

        model.addAttribute("employee",new Employee());
        model.addAttribute("stateList", DataGenerator.getStateList());
        return "/employee/employee-create";
    }


    @PostMapping("/list")
    public String employeeList(@ModelAttribute("employee") Employee employee, Model model ){
        model.addAttribute("/employeeList", Arrays.asList(employee));
        return "employee/employee-list";
    }

}
