package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Value("${instructor}")
    private String instructorName;

    @Value("11223")
    private String courseID;

    @Override
    public String toString() {
        return "Java{" +
                "instructorName='" + instructorName + '\'' +
                ", courseID='" + courseID + '\'' +
                '}';
    }

    private ExtraSession extraSession;

    @Override
    public int getTeachingHors() {
        return 20 + extraSession.getHours();
    }

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }
}
