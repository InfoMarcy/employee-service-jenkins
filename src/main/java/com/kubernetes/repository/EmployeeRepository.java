package com.kubernetes.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kubernetes.model.Employee;

@Repository
public class EmployeeRepository {

	// declare a list of users
	private List<Employee> listaEmpleados = new ArrayList<>();

	public List<Employee> findAll() {
		return listaEmpleados;
	}

	public Employee findById(String id) {

		Employee empleado = listaEmpleados.stream().filter(user -> id.equals(user.getId())).findAny().orElse(null);
		return empleado;
	}
	
	public List<Employee> save(Employee employee) {

		listaEmpleados.add(employee);
		
		return listaEmpleados;
	}


}

































//
//import java.util.List;
//
//import org.springframework.data.repository.CrudRepository;
//
//import com.kubernetes.model.Employee;
//
//public interface EmployeeRepository extends CrudRepository<Employee, String> {
// List<Employee> findByDepartmentId(Long departmentId);
// List<Employee> findByOrganizationId(Long organizationId);
//}