package com.example.collection.employees;

import java.util.Comparator;

public class FirstNameSorter implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getfName().compareToIgnoreCase(e2.getfName());
	}
}
