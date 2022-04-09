package com.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.services.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    public SubjectService subjectService;

//    @PostMapping("/add")
//    public Subject saveSubject(@RequestBody Subject subject) {
//        subjectService.saveSubject(subject);
//        return subject;
//    }

//    @GetMapping("/get_subjects")
//    public List<Subject> getallSubjects() {
//        return subjectService.getAllSubjects();
//    }

}
