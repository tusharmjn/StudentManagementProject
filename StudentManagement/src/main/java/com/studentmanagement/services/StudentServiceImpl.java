package com.studentmanagement.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entities.Student;
import com.studentmanagement.entities.StudentSubject;
import com.studentmanagement.exception.ResourceNotFoundException;
import com.studentmanagement.repository.StudentRepo;
import com.studentmanagement.repository.SubjectRepo;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student, Set<StudentSubject> studentSubjects) {
        student.getStudentSubjects().addAll(studentSubjects);
//        for (StudentSubject item : studentSubjects) {
//            subjectRepo.save(item.getSubject());
//        }
        studentRepo.save(student);
        return student;
    }

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
        studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "ID", String.valueOf(id)));
        studentRepo.deleteById(id);

    }

}

//}
