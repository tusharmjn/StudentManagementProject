//package com.studentmanagement.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.studentmanagement.entities.Student;
//import com.studentmanagement.services.StudentService;
//
//@CrossOrigin(origins = "http://localhost:4200")
//@RestController
//@RequestMapping("/api/v1/")
//public class Controller {
//
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping("/students")
//    public List<Student> getAllStudents() {
//        return studentService.getAllStudents();
//    }
//
//    @GetMapping("/students/{id}")
//    public Student getStudentById(@PathVariable long id) {
//        return studentService.getStudentById(id);
//    }
//
////    @PostMapping("/students")
////    public Student saveStudent(@RequestBody Student student) {
////        return studentService.saveStudent(student);
////    }
//
////    @PutMapping("/students/{id}")
////    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable(name = "id") long id) {
////        return new ResponseEntity<Student>(studentService.updateStudent(student, id), HttpStatus.OK);
////    }
//
//    @PutMapping("/students/{id}")
//    public Student updateStudent(@RequestBody Student student, @PathVariable long id) {
//        return studentService.updateStudent(student, id);
//    }
//
//    @DeleteMapping("/students/{id}")
//    public void deleteStudent(@PathVariable Long id) {
//        studentService.deleteStudent(id);
//    }
//}
