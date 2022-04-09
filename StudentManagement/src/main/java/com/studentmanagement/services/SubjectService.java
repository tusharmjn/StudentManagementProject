package com.studentmanagement.services;

import java.util.List;

import com.studentmanagement.entities.Subject;

public interface SubjectService {

    public List<Subject> getAllSubjects();

    public Subject saveSubject(Subject subject);

    public Subject getSubjectById(Long id);

    public Subject updateSubject(Subject subject, long id);

    public void deleteSubject(long id);

}
