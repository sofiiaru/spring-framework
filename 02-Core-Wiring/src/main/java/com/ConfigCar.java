package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car() {
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
    //this is also an example of dependency injection where Spring container injects objects into other objects or dependencies
    @Bean
    Person person() {
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car());//direct wiring - calling one bean method inside another
        return p;
    }

    //Autowiring  - path as a parameter
//    @Bean
//    Person person(Car car) {
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car);
//        return p;
//    }
}
