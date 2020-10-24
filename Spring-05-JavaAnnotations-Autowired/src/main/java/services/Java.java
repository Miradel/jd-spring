package services;

import interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // Will create bean for Java Class
public class Java implements Course {

    //@Autowired
    private OfficeHours officeHours;

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours Java :" + (30 + officeHours.getHours()));
    }

    //Constructor Injection
    @Autowired
    public Java(OfficeHours officeHours){
        this.officeHours = officeHours;
    }


}
