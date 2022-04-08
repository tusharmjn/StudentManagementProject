package com.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.entities.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long> {

}
