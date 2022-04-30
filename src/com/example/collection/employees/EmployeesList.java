package com.example.collection.employees;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeesList {
	public static ArrayList<Employee> getUnsortedEmployeeList() {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(2l, "Lokesh", "Gupta", LocalDate.parse("2021-01-07"), 86539.02));
		list.add(new Employee(1l, "Alex", "Gussin", LocalDate.parse("2011-10-22"), 5628.32));
		list.add(new Employee(4l, "Brian", "Sux", LocalDate.parse("2015-03-10"), 127.02));
		list.add(new Employee(5l, "Neon", "Piper", LocalDate.parse("2016-07-03"), 4532.02));
		list.add(new Employee(3l, "David", "Beckham", LocalDate.parse("2020-02-28"), 659.02));
		list.add(new Employee(7l, "Alex", "Beckham", LocalDate.parse("2022-01-30"), 53.02));
		list.add(new Employee(6l, "Brian", "Suxena", LocalDate.parse("2019-01-15"), 126539.02));
		return list;
	}

}
