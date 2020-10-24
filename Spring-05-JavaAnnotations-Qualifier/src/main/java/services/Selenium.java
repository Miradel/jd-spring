package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours Selenium: " + (30 + extraSessions.getHours()));
    }

    public Selenium(@Qualifier("mockInterviewHours") ExtraSessions extraSessions ){
        this.extraSessions = extraSessions;
    }
}
