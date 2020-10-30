package services;

import interfaces.Course;
import interfaces.ExtraSesstions;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;
import java.util.stream.Stream;

public class Api implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours API : 45");
    }

    @Value("JD1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Api{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    private ExtraSesstions extraSesstions;

    public Api(ExtraSesstions extraSesstions) {
        this.extraSesstions = extraSesstions;
    }
}
