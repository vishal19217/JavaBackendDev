package com.example.vishal.SpringJPA;

import com.example.vishal.SpringJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    // Query DSL
    @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name);
    @Query(value = "select * from Student where name = :name",nativeQuery = true)
    List<Student> findByNativeName(String name);
}
