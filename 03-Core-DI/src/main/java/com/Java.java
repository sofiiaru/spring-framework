package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

   // @Autowired field injection--> not recommended
    OfficeHours officeHours;


    @Autowired // constructor injection - recommended, can be omitted if only one constructor
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+(20 + officeHours.getHours()));
    }
}
