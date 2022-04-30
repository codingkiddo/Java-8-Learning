package com.example.collection.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.collection.employees.Employee;
import com.example.collection.employees.EmployeesList;

public class CountEmployeesGroupByCity {

	public static void main(String[] args) {
		
		
		
		System.out.println(Collectors.counting());
		
		
		List<Employee> employees = EmployeesList.getUnsortedEmployeeList();
		Map<String, Long> resultByCount = employees.stream().collect(Collectors.groupingBy(
					Employee::getCity, Collectors.counting()
				));
		System.out.println(resultByCount);
		
		Map<String, List<Employee>> resultByList = employees.stream().collect(Collectors.groupingBy(
				Employee::getCity, Collectors.toList()
			));
		System.out.println(resultByList);		
		
		double totalSalary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Total Salary: " + totalSalary);
		
		Map<String, Double> totalSalaryByCity = employees.stream().collect(
					Collectors.groupingBy(Employee::getCity, Collectors.summingDouble(Employee::getSalary))
				);
		System.out.println("Total Salary By City: " + totalSalaryByCity);
	}

}
