package com.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.entities.Subject;
import com.studentmanagement.services.SubjectService;

@RestController("/api")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/createsubject")
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.createsubject(subject);
    }

}
