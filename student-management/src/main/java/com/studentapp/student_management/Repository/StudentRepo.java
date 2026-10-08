package com.studentapp.student_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentapp.student_management.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
}
