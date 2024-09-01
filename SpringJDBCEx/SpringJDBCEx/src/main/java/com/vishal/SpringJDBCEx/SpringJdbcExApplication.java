package com.vishal.SpringJDBCEx;

import com.vishal.SpringJDBCEx.model.Student;
import com.vishal.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(4);
		s.setName("Lalit");
		s.setMarks(100);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> studentsLst = service.getStudents();
		for (Student st: studentsLst) {
			System.out.println(st.getRollNo() + " "+st.getName() + " "+st.getMarks());
		}


	}

}
