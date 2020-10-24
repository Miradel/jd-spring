package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Stream;

@Component  // Will create bean for Java Class
public class Java implements Course {
    @Value("JD1")
    private String batch;


    // Get value from property file
    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    @Autowired
    @Qualifier("officeHours")
    private ExtraSessions extraSessions;


    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours Java : " + (20 + extraSessions.getHours()));
    }






}
