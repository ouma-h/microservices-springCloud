package com.sid.studentservice.service;

import com.sid.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
public class StudentRestService {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/results")
    public Object tellMe() {
        List<Object[]> objects = studentRepository.getstudentsbyresults();
        return ResponseEntity.ok().body(objects);
    }

}
