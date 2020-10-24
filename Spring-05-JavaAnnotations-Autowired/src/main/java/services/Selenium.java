package services;

import interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private OfficeHours officeHours;

    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    // Setter Injection
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours Selenium :" + (20 + officeHours.getHours()));
    }
}
