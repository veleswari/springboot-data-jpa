package com.spring.spring.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.spring.data.jpa.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	public List<Student> findByFirstName(String firstName);
	
	public List<Student> findByFirstNameContaining(String name);
	
	public List<Student> findByGuardianGuardianName(String guardianName);
	
	//JPQL
	@Query("select s from Student s where s.emailId = ?1")
	public Student getStudentByEmailAddress(String emailId); 
	
	@Query("select s.firstName from Student s where s.emailId = ?1")
	public String getStudentFirstNameByEmailAddress(String emailId);
	
	//Native Query
	
	@Query(
			value = "SELECT * FROM tbl_student s where s.email_address = ?1",
			nativeQuery = true
	)
	Student getStudentByEmailAddressNative(String emailId);
	
	//Native named Query
	
	@Query(
			value = "SELECT * FROM tbl_student s where s.email_address = :emailId",
			nativeQuery = true
	)
	Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emailId);
	
	@Modifying
	@Transactional
	@Query(
			value="update tbl_student set first_name = ?1 where email_address = ?2",
			nativeQuery = true
	)
	int updateStudentNameByEmailAddress(String firstName, String emailId);
}
 