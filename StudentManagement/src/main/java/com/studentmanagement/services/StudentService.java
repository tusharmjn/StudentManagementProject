package com.studentmanagement.services;

import java.util.List;

import com.studentmanagement.entities.Student;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

    public Student getStudentById(Long id);

    public Student updateStudent(Student student, long id);

//    public void deleteStudent(Long studentId);
    public void deleteStudent(long id);
//    public List<Student> printbyname(String name);
}
