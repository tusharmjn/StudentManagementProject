package com.studentmanagement.services;

import org.springframework.stereotype.Service;

import com.studentmanagement.entities.Subject;

@Service
public interface SubjectService {

    public Subject createsubject(Subject subject);

}
