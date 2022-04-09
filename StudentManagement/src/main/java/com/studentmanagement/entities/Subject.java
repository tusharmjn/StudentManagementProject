package com.studentmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
public class Subject {

    @Id
    private Long subjectId;
    private String subjectName;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subject")
//    @JsonIgnore
//    private Set<StudentSubject> studentSubjects = new HashSet<>();
//
//    public Set<StudentSubject> getStudentSubjects() {
//        return studentSubjects;
//    }
//
//    public void setStudentSubjects(Set<StudentSubject> studentSubjects) {
//        this.studentSubjects = studentSubjects;
//    }

    public Subject() {
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    public Subject(Long subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }
}

//    private Student student;
//
//}
