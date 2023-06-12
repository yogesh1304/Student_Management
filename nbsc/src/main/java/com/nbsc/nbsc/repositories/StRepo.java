package com.nbsc.nbsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nbsc.nbsc.models.Student;

public interface StRepo extends JpaRepository<Student, Integer>{

    
}
