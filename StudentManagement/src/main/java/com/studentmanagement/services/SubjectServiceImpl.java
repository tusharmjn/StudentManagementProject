package com.studentmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entities.Subject;
import com.studentmanagement.repository.SubjectRepo;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public void deleteSubject(long id) {

    }

    @Override
    public List<Subject> getAllSubjects() {
        return null;
    }

    @Override
    public Subject saveSubject(Subject subject) {
        subjectRepo.save(subject);
        return subject;
    }

    @Override
    public Subject getSubjectById(Long id) {

        return null;
    }

    @Override
    public Subject updateSubject(Subject subject, long id) {

        return null;
    }

}
