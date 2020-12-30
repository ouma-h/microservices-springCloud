package com.sid.studentservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class StudentRestService {
    @Value("kita hob")
    private String message;

    @RequestMapping("/messages")
    public String tellMe(){
        System.out.println("###############   ASSLEEEEEEEEEEEMA");
        return message;
    }

}
