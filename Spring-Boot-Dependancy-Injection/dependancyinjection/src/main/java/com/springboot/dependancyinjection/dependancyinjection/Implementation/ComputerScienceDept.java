package com.springboot.dependancyinjection.dependancyinjection.Implementation;

import org.springframework.stereotype.Component;

import com.springboot.dependancyinjection.dependancyinjection.Interface.HeadDepartment;


@Component
public class ComputerScienceDept implements  HeadDepartment{
    public String getDeptName() {
        return "Welcome to Computer Science Department ! .....";
    }

}
