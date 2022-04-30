package com.example.collection.employees;

import java.time.LocalDate;

public class Employee {

    private Long id;
    private String fName;
    private String lName;
    private LocalDate dataOfJoin;
    private Double salary;
    
	public Employee(Long id, String fName, String lName, LocalDate dataOfJoin, Double salary) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dataOfJoin = dataOfJoin;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public LocalDate getDataOfJoin() {
		return dataOfJoin;
	}
	public void setDataOfJoin(LocalDate dataOfJoin) {
		this.dataOfJoin = dataOfJoin;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dataOfJoin=" + dataOfJoin
				+ ", salary=" + salary + "]";
	}
    
}
