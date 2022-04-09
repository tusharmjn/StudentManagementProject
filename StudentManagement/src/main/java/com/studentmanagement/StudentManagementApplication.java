package com.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentmanagement.services.StudentService;
import com.studentmanagement.services.SubjectService;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");

        System.out.println(subjectService.getAllSubjects());

//        Subject sub1 = new Subject(Long.valueOf(1), "HINGLISH");
//        Subject sub2 = new Subject(Long.valueOf(2), "MECHATRONICS");
//        Subject sub3 = new Subject(Long.valueOf(3), "CHEM");
//
//        this.subjectService.saveSubject(sub2);
//        this.subjectService.saveSubject(sub1);
//
//        Student st1 = new Student("Tushar", "xyz@", "cse", 123);
//        Student st2 = new Student("Shobit", "xyzxc@", "civil", 321);
//
//        Set<StudentSubject> studentSubjects = new HashSet<StudentSubject>();
//        studentSubjects.add(new StudentSubject(st2, sub2));
//        studentSubjects.add(new StudentSubject(st2, sub1));
//        studentSubjects.add(new StudentSubject(st2, sub3));
//
//        Student student = this.studentService.saveStudent(st2, studentSubjects);

    }

//    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
//                "Accept", "Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
//                "Access-Control-Request-Headers"));
//        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
//                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
//        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//        return new CorsFilter(urlBasedCorsConfigurationSource);
//
//    }

}
