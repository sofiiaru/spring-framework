package com.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        //container for beans (from spring-context)
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class, ConfigAny.class);

        FullTimeMentor ftm = container.getBean(FullTimeMentor.class);
        ftm.createAccount();

        String s = container.getBean(String.class);
        System.out.println(s);



    }
}
