package com.example.college_server.repository;

import com.example.college_server.model.CourseFee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseFeeRepository extends JpaRepository<CourseFee, Long> {
}
