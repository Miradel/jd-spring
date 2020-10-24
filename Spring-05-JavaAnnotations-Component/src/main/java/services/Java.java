package services;

import interfaces.Course;
import org.springframework.stereotype.Component;

@Component // it will create the bean for the Java Class
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 30");
    }


}
