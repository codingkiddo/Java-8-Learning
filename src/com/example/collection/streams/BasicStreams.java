package com.example.collection.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.example.collection.employees.Employee;
import com.example.collection.employees.EmployeesList;

public class BasicStreams {
	public static void main(String args[]) {
		
		List<Employee> employees = EmployeesList.getUnsortedEmployeeList();
		
		List<Employee> filteredEmployees = employees.stream().limit(2).collect(Collectors.toList());
		
		System.out.println(filteredEmployees);
	}

}
