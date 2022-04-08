package com.studentmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentSubjectId;

    // student
    @ManyToOne(fetch = FetchType.EAGER)
    private Student student;

    @ManyToOne
    private Subject subject;

    public StudentSubject() {

    }

    public Long getStudentSubjectId() {
        return studentSubjectId;
    }

    public void setStudentSubjectId(Long studentSubjectId) {
        this.studentSubjectId = studentSubjectId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

}
