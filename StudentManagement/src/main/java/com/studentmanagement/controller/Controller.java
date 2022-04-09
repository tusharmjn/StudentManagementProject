package com.studentmanagement.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.entities.Student;
import com.studentmanagement.entities.StudentSubject;
import com.studentmanagement.entities.Subject;
import com.studentmanagement.services.StudentService;
import com.studentmanagement.services.SubjectService;

import pojo.StudentRequest;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/add_student")
    public Student saveStudent(@RequestBody StudentRequest studentRequest) {
        Student student = new Student(studentRequest.name, studentRequest.email, studentRequest.department,
                studentRequest.phoneNumber);
        Set<StudentSubject> studentSubjects = new HashSet<>();

        for (long id : studentRequest.subjectIds) {
            Subject subject = subjectService.getSubjectById(id);
            StudentSubject temp = new StudentSubject(student, subject);
            studentSubjects.add(temp);
        }

        return studentService.saveStudent(student, studentSubjects);
    }

//    @PutMapping("/students/{id}")
//    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable(name = "id") long id) {
//        return new ResponseEntity<Student>(studentService.updateStudent(student, id), HttpStatus.OK);
//    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable long id) {
        return studentService.updateStudent(student, id);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PostMapping("/add")
    public Subject saveSubject(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
        return subject;
    }

    @GetMapping("/get_subjects")
    public List<Subject> getallSubjects() {
        return subjectService.getAllSubjects();
    }

}
