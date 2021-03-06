package com.studentmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entities.Student;
import com.studentmanagement.exception.ResourceNotFoundException;
import com.studentmanagement.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        studentRepo.save(student);
        return student;
    }

//   

    @Override
    public Student updateStudent(Student student, long id) {
        Student stud = studentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "ID", String.valueOf(id)));
        stud.setName(student.getName());
        stud.setEmail(student.getEmail());
        stud.setPhoneNumber(student.getPhoneNumber());
        stud.setDepartment(student.getDepartment());
        studentRepo.save(stud);
        return stud;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "ID", String.valueOf(id)));
    }

//    @Override
//  public void deleteStudent(Long studentId) {
//      studentRepo.deleteById(studentId);
//  }

    @Override
    public void deleteStudent(long id) {
        studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Buddy", "ID", String.valueOf(id)));
        studentRepo.deleteById(id);

    }

//    @Override
//    public Student createStudent(Student student, Set<StudentSubject> studentSubject) {
//        this.studentRepo.fin
//        return null;
//    }

}

//}
