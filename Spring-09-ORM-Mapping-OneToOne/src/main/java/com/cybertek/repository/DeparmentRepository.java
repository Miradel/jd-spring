package com.cybertek.repository;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmentRepository extends JpaRepository<Department,Integer> {
}
