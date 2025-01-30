package com.springboot.dependancyinjection.dependancyinjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dependancyinjection.dependancyinjection.Interface.HeadDepartment;

@RestController
public class CollageDirectory {

    
    private HeadDepartment headDepartment;

    @Autowired
    public CollageDirectory(HeadDepartment headDepartment){
        this.headDepartment = headDepartment;
    }

    @GetMapping("/deptname")
    public String getNameOfDept(){
        return headDepartment.getDeptName();
    }
}
