package com.example.aulaidspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.services.SalaryService;

@SpringBootApplication
public class AulaidSpringApplication implements CommandLineRunner {
	
	@Autowired
	private SalaryService salaryService;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaidSpringApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Salario Liquido: " + salaryService.netSalary(4000.00));
	}

}
