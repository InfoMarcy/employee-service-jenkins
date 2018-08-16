package com.kubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.kubernetes.model.Employee;
import com.kubernetes.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeServiceKubernetesApplication {
	@Autowired
	EmployeeRepository repository;

	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceKubernetesApplication.class, args);
	}
	
	@Bean
	EmployeeRepository repository() {
		
		repository.save(new Employee(1L, 1L, "John Smith", 34, "Analyst"));
		repository.save(new Employee(1L, 1L, "Darren Hamilton", 37, "Manager"));
		repository.save(new Employee(1L, 1L, "Tom Scott", 26, "Developer"));
		repository.save(new Employee(1L, 2L, "Anna London", 39, "Analyst"));		
		repository.save(new Employee(1L, 2L, "Patrick Dempsey", 27, "Developer"));
		repository.save(new Employee(2L, 3L, "Kevin Price", 38, "Developer"));		
		repository.save(new Employee(2L, 3L, "Ian Scott", 34, "Developer"));
		repository.save(new Employee(2L, 3L, "Andrew Campton", 30, "Manager"));
		repository.save(new Employee(2L, 4L, "Steve Franklin", 25, "Developer"));
		repository.save(new Employee(2L, 4L, "Elisabeth Smith", 30, "Developer"));
		return repository;
	}
}
