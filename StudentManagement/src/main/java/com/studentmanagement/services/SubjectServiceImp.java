package com.studentmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entities.Subject;
import com.studentmanagement.repository.SubjectRepo;

@Service
public class SubjectServiceImp implements SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    public Subject createsubject(Subject subject) {
        subjectRepo.save(subject);
        return subject;

    }
}
