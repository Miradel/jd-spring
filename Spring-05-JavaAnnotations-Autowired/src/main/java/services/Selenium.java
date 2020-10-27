package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private ExtraSessions extraSessions;

    //Setter Injection
    @Autowired
    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours Selenium :" + (20 + extraSessions.getHours()));
    }
}
