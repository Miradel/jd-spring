package com.derivequery.repository;

import com.derivequery.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String>  {

    // Display all departments in the furniture department
    List<Department> findByDepartment(String department);

    // Display all departments in the health Division
    List<Department> findByDivision(String division);

    // Display all departments in the health Division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    // Display all department division name end with 'ics'
    List<Department> findByDivisionEndingWith(String patterns);

    // Display top 3 departmens with divion name equals 'Hea' without duplicate
    List<Department> findDistinctTop3ByDivisionIsContaining(String pattern);

}
