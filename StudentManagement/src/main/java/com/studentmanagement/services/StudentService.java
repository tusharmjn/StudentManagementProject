package com.studentmanagement.services;

import java.util.List;
import java.util.Set;

import com.studentmanagement.entities.Student;
import com.studentmanagement.entities.StudentSubject;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

    public Student getStudentById(Long id);

    public Student updateStudent(Student student, long id);

//    public void deleteStudent(Long studentId);
    public void deleteStudent(long id);
//    public List<Student> printbyname(String name);

    public Student createStudent(Student student, Set<StudentSubject> studentSubject);
}
