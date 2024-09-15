package com.example.vishal.SpringJPA;

import com.example.vishal.SpringJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.text.html.Option;
import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("Ravi");
		s1.setMarks(95);
		s2.setRollNo(2);
		s2.setName("Shyam");
		s2.setMarks(94);
		s3.setRollNo(3);
		s3.setName("David");
		s3.setMarks(86);

//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

		System.out.println(repo.findAll());
		Optional<Student> s = repo.findById(2);
		System.out.println(s.orElse(new Student()));

		System.out.println(repo.findByName("David"));
		System.out.println(repo.findByNativeName("Ravi"));

//		repo.delete(s3);

	}

}
