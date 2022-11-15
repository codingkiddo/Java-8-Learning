package com.example.generics;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<Employee> isAdultMale() {
		return e -> e.getAge()>8 && e.getGender().equalsIgnoreCase("M"); 
	}
	
	public static Predicate<Employee> isAdultFeMale() {
		return e -> e.getAge()>8 && e.getGender().equalsIgnoreCase("F"); 
	}
	
	public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return e -> e.getAge() > age;
    }
	
	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.toList());
	}

}
