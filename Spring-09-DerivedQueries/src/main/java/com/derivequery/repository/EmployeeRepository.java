package com.derivequery.repository;

import com.derivequery.entity.Employee;
import com.derivequery.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    // Display all Employee with email address
    List<Employee> findByEmail(String email);

    // Display all employees with first_name and last_name, also show all employees with a email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname, String lastName, String email);

    // Display all employees with first_name is not ''
    List<Employee> findByFirstNameNot(String firstName);

    // Display all employees where lastName start with ''
    List<Employee> findByLastNameStartingWith(String patterns);

    // Display all employees with salaries higher than ""
    List<Employee> findBySalaryIsGreaterThan(Integer salary);

    // Display all employees with salaries less than ""
    List<Employee> findBySalaryLessThan(Integer salary);

    // Display all employees that hired between '' and ''
    List<Employee> findByHireDateBetween(LocalDate startData, LocalDate endDate);

    // Display all employees where salires grater and eqauls to ''  inorder
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    // Display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    // Display all employees that do not have email address
    List<Employee> findByEmailIsNull();



}
