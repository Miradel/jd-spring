package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // Will create bean for Java Class
public class Java implements Course {

    @Autowired
    @Qualifier("officeHours")
    private ExtraSessions extraSessions;


    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours Java : " + (20 + extraSessions.getHours()));
    }




}
