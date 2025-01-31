package com.springboot.dependancyinjection.dependancyinjection.Implementation;

import org.springframework.stereotype.Component;

import com.springboot.dependancyinjection.dependancyinjection.Interface.Laboratory;

@Component
public class AutomationLab implements Laboratory {

    @Override
    public String getLaboratoryName() {
        return "Welcome to Automation Lab !! .....";
    }
    
}
