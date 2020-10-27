package services;

import interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours Java : 30");
    }


    @PostConstruct
    public void postConstructor(){
        System.out.println("Running post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Running pre destroy");
    }
}
