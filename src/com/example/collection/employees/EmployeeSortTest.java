package com.example.collection.employees;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortTest {

	public static void main(String[] args) {

		List<Employee> employees = EmployeesList.getUnsortedEmployeeList();
		System.out.println("Before: ");
		employees.forEach(System.out::println);
		Collections.sort(employees, Comparator.comparing(Employee::getfName));
//		Collections.sort(employees, Comparator.comparing(Employee::getfName).thenComparing(Employee::getSalary));
		System.out.println("After: ");
		employees.forEach(System.out::println);

	}

}

//Collections.sort(employees, Comparator.comparing(Employee::getfName));
//Before: 
//Employee [id=2, fName=Lokesh, lName=Gupta, dataOfJoin=2021-01-07, salary=86539.02]
//Employee [id=1, fName=Alex, lName=Gussin, dataOfJoin=2011-10-22, salary=5628.32]
//Employee [id=4, fName=Brian, lName=Sux, dataOfJoin=2015-03-10, salary=127.02]
//Employee [id=5, fName=Neon, lName=Piper, dataOfJoin=2016-07-03, salary=4532.02]
//Employee [id=3, fName=David, lName=Beckham, dataOfJoin=2020-02-28, salary=659.02]
//Employee [id=7, fName=Alex, lName=Beckham, dataOfJoin=2022-01-30, salary=53.02]
//Employee [id=6, fName=Brian, lName=Suxena, dataOfJoin=2019-01-15, salary=126539.02]
//After: 
//Employee [id=7, fName=Alex, lName=Beckham, dataOfJoin=2022-01-30, salary=53.02]
//Employee [id=1, fName=Alex, lName=Gussin, dataOfJoin=2011-10-22, salary=5628.32]
//Employee [id=4, fName=Brian, lName=Sux, dataOfJoin=2015-03-10, salary=127.02]
//Employee [id=6, fName=Brian, lName=Suxena, dataOfJoin=2019-01-15, salary=126539.02]
//Employee [id=3, fName=David, lName=Beckham, dataOfJoin=2020-02-28, salary=659.02]
//Employee [id=2, fName=Lokesh, lName=Gupta, dataOfJoin=2021-01-07, salary=86539.02]
//Employee [id=5, fName=Neon, lName=Piper, dataOfJoin=2016-07-03, salary=4532.02]


//Collections.sort(employees, Comparator.comparing(Employee::getfName).thenComparing(Employee::getSalary));
//Before: 
//Employee [id=2, fName=Lokesh, lName=Gupta, dataOfJoin=2021-01-07, salary=86539.02]
//Employee [id=1, fName=Alex, lName=Gussin, dataOfJoin=2011-10-22, salary=5628.32]
//Employee [id=4, fName=Brian, lName=Sux, dataOfJoin=2015-03-10, salary=127.02]
//Employee [id=5, fName=Neon, lName=Piper, dataOfJoin=2016-07-03, salary=4532.02]
//Employee [id=3, fName=David, lName=Beckham, dataOfJoin=2020-02-28, salary=659.02]
//Employee [id=7, fName=Alex, lName=Beckham, dataOfJoin=2022-01-30, salary=53.02]
//Employee [id=6, fName=Brian, lName=Suxena, dataOfJoin=2019-01-15, salary=126539.02]
//After: 
//Employee [id=1, fName=Alex, lName=Gussin, dataOfJoin=2011-10-22, salary=5628.32]
//Employee [id=7, fName=Alex, lName=Beckham, dataOfJoin=2022-01-30, salary=53.02]
//Employee [id=4, fName=Brian, lName=Sux, dataOfJoin=2015-03-10, salary=127.02]
//Employee [id=6, fName=Brian, lName=Suxena, dataOfJoin=2019-01-15, salary=126539.02]
//Employee [id=3, fName=David, lName=Beckham, dataOfJoin=2020-02-28, salary=659.02]
//Employee [id=2, fName=Lokesh, lName=Gupta, dataOfJoin=2021-01-07, salary=86539.02]
//Employee [id=5, fName=Neon, lName=Piper, dataOfJoin=2016-07-03, salary=4532.02]

