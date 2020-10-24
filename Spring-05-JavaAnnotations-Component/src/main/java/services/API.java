package services;

import interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching Hours for Api is 40");
    }
}
