package com.utm.codes.studentsystem.repository;

import com.utm.codes.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT e FROM Student e WHERE e.name = :name")

   Student existsByName(String name);
}
