package com.example.collection.streams;

import java.util.Collections;
import java.util.Comparator;
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
		
//		Comparing and sorting
		
		Comparator<Employee> fNameCompare = Comparator.comparing(Employee::getfName);
		System.out.println(employees.stream().sorted(fNameCompare).collect(Collectors.toList()));
		
		
		System.out.println(employees.stream()
				.filter(e -> e.getCity().equals("BAN"))
				.map( e -> e.getlName())
				.collect(Collectors.toList()));
	}

}
