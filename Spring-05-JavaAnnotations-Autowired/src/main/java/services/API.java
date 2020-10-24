package services;

import interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {
    @Autowired
    private OfficeHours officeHours;


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours API :" + (30 + officeHours.getHours()));
    }
}
