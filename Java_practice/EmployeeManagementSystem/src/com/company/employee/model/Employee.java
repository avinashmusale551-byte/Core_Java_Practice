package com.company.employee.model;

public class Employee implements Comparable<Employee> {
		
		private int employeeId;
		private String name;
		private String email;
		private int age;
		private String department;
		private String designation;
		private double salary;
		
		

	public Employee(int employeeId,String name,String email,int age,String department,String designation,double salary){
		this.employeeId=employeeId;
		this.name=name;
		this.email=email;
		this.age=age;
		this.department=department;
		this.designation=designation;
		this.salary=salary;
		
		
	}
	

	//get for reading 
	public int getemployeeId(){
		return employeeId;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public int getage() {
		return age;
	}
	public String getdepartment() {
		return department;
	}
	public String getdesignation() {
		return designation;
	}
	public double getsalary() {
		return salary;
	}
	
	//set for writing
	
	public void setemployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setemial(String email) {
		this.email=email;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	public void setdesignation(String designation) {
		this.designation=designation;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}


	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.employeeId,o.employeeId);
	}
	
	public String toString() {
	    return "*ID: " + employeeId + " * Name: " + name + " * Email: " + email + " * Age: " + age + " * Department: " + department + " * Designation: " + designation + " * Salary: " + salary;
	}

}

