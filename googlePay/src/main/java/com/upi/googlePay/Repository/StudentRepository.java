package com.upi.googlePay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.upi.googlePay.Entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student,Integer>{

	   @Modifying
	   @Transactional
	   @Query(value="update student set lastname= :newname where id= :id;",nativeQuery=true)
	   public int updateName(@Param(value="newname") String newname,@Param(value="id") int id);
	   
	   
	   
	   @Query(value="select * from student where firstname= :nm;",nativeQuery=true)
	   public Student getbyname(@Param(value="nm") String nm);
	
}
