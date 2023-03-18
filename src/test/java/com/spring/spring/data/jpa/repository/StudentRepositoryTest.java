package com.spring.spring.data.jpa.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.spring.data.jpa.entity.Guardian;
import com.spring.spring.data.jpa.entity.Student;

@SpringBootTest 
class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepository;

//	@Test
//	public void saveStudent() {
//		Student student = Student.builder()
//				.emailId("asha@gmail.com")
//				.firstName("asha")
//				.lastName("paluru") 
//				//.guardianEmail("mohan@gmail.com")
////				.guardianMobile("9999999999")
////				.guardianName("mohan")
//				.build();
//		
//		studentRepository.save(student);
//	}
	
//	@Test
//	public void saveStudentWithGuardian() {
//		Guardian guardian = Guardian.builder()
//				.guardianEmail("raghu@gmail.com")
//				.guardianMobile("888888888")
//				.guardianName("raghu")
//				.build();
//		
//		Student student = Student.builder()
//				.emailId("shivam@gmail.com")
//				.firstName("shivam")
//				.lastName("singh")
//				.guardian(guardian) 
//				.build();
//		studentRepository.save(student);
//	}
//	
//	@Test
//	public void printAllStudents() {
//		List<Student> studentList = studentRepository.findAll();
//		System.out.println("Student List= "+studentList);
//	}
	
//	@Test
//	public void printStudentByFirstName() {
//		List<Student> students = studentRepository.findByFirstName("asha");
//		System.out.println("Students= "+students);
//	}
	
//	@Test
//	public void printStudentByFirstNameContaining() {
//		List<Student> students = studentRepository.findByFirstNameContaining("sh"); 
//		System.out.println("Students= "+students);
//	} 
//	
//	@Test
//	public void printStudentByGuardian() { 
//		List<Student> students = studentRepository.findByGuardianGuardianName("mohan"); 
//		System.out.println("Students= "+students);
//	}
	
//	@Test 
//	public void printStudentByEmailAddress() {
//		Student student = studentRepository.getStudentByEmailAddress("asha@gmail.com");
//		System.out.println("Students= "+student);
//	}
	
//	@Test
//	public void getStudentFirstNameByEmailAddress() {
//		String firstName = studentRepository.getStudentFirstNameByEmailAddress("asha@gmail.com");
//		System.out.println("First Name= "+firstName);
//	}
//	
//	@Test 
//	public void printStudentByEmailAddressNative() {
//		Student student = studentRepository.getStudentByEmailAddressNative("asha@gmail.com");
//		System.out.println("Students= "+student);
//	}
//	
//	@Test 
//	public void printStudentByEmailAddressNativeNamedParam() {
//		Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("shivam@gmail.com");
//		System.out.println("Students= "+student);
//	}
	
	@Test
	public void updateStudentNameByEmailAddressTest() {
		studentRepository.updateStudentNameByEmailAddress("asha p", "asha@gmail.com");
	}


}
