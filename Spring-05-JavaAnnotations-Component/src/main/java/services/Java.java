package services;

import interfaces.Course;
import org.springframework.stereotype.Component;

@Component  // Will create bean for Java Class
public class Java implements Course {

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours Java : 20");
    }



}
