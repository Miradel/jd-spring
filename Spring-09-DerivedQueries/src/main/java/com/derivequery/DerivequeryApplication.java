package com.derivequery;

import com.derivequery.repository.DepartmentRepository;
import com.derivequery.repository.EmployeeRepository;
import com.derivequery.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivequeryApplication {

	@Autowired
	RegionRepository regionRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DerivequeryApplication.class, args);
	}


	@PostConstruct
	public void testRegions(){

		System.out.println("----------Regions Start----------");
		System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
		System.out.println("findDistinctByCountry: " + regionRepository.findDistinctByCountry("Canada"));
		System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));
		System.out.println("findByCountryContainingOrderByCountry: " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
		System.out.println("findTop2ByCountry: " + regionRepository.findTop2ByCountry("Canada"));

		System.out.println("----------Employee Start----------");
		//System.out.println(employeeRepository.findByEmailIsNull());

	}

	@PostConstruct
	public void testDepartments(){

		System.out.println("---------Department start------------");

		System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Toys"));
		System.out.println("findByDivision: " + departmentRepository.findByDivision("Outdoors"));
		System.out.println("findByDivisionEndingWith: " + departmentRepository.findByDivisionEndingWith("ics"));
		System.out.println("findDistinctTop3ByDivisionContains: " + departmentRepository.findDistinctTop3ByDivisionIsContaining("Hea"));

		System.out.println("---------Department End------------");

	}

	@PostConstruct
	public void testEmployees(){

		System.out.println("---------Employee start------------");

		System.out.println(employeeRepository.findByEmailIsNull());


		System.out.println("---------Employee End------------");

	}
}
