package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.Data;


public class Java implements Course {

//    OfficeHours officeHours;
//
//    public Java (OfficeHours officeHours){
//        this.officeHours = officeHours;
//    }

    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }

    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }
}
