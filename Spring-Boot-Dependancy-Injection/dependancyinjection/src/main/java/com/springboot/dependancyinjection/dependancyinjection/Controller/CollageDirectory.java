package com.springboot.dependancyinjection.dependancyinjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dependancyinjection.dependancyinjection.Interface.CollageInfo;
import com.springboot.dependancyinjection.dependancyinjection.Interface.HeadDepartment;
import com.springboot.dependancyinjection.dependancyinjection.Interface.Laboratory;

@RestController
public class CollageDirectory {
    private HeadDepartment headDepartment;

    private Laboratory laboratory;

    // Constructor Injection

    @Autowired
    public CollageDirectory(HeadDepartment headDepartment){
        this.headDepartment = headDepartment;
    }

    // Setter Injection

    @Autowired
    public void setInjection(Laboratory laboratory){
        this.laboratory = laboratory;
    }

    //Field Injection
    @Autowired
    private CollageInfo collageInfo;

    @GetMapping("/deptname")
    public String getNameOfDept(){
        return headDepartment.getDeptName();
    }

    @GetMapping("/labname")
    public String getNameOfLab(){
        return laboratory.getLaboratoryName();
    }

    @GetMapping("/collagename")
    public String getNameOfCollage(){
        return collageInfo.getCollageName();
    }
}
