package com.springboot.dependancyinjection.dependancyinjection.Implementation;

import org.springframework.stereotype.Component;

import com.springboot.dependancyinjection.dependancyinjection.Interface.CollageInfo;


@Component
public class CollageInfoImpl implements CollageInfo {

    @Override
    public String getCollageName() {
        return "Welcome to ABC collage !! ...";
    }
    
}
