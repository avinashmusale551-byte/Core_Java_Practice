package com.company.employee.service;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class DepartmentService {
	private Set<String> department=new HashSet<>();
	
	public boolean adddepartment(String name) {
		if(name==null||name.trim().isEmpty()) {
			System.out.println("Department name cannot be empty.");
			return false;
		}
		boolean added=department.add(name.trim());
		if(added) {
			System.out.println("Dpeartment name added successfully.");
		}
		else {
			System.out.println("Dpeartment name is already exists.");
		}
		return added;
	}
	public void displaydepartment() {
		if(department.isEmpty()) {
			System.out.println("No departments found !");
			return;
		}
		
		Iterator<String> it=department.iterator();
		while(it.hasNext()) {
			String items=it.next();
			System.out.println(items);
		}
		}
	public void searchdepartment(String name) {
		if(department.contains(name.trim())) {
			System.out.println("Department found.");
		}
		else {
			System.out.println("Department not found !");
		}
	}
	public void removedepartment(String name) {
		if(department.remove(name.trim())) {
			System.out.println("Successfully removed.");
		}
		else {
			System.out.println("Department not found !");
		}	
	}
	

		
	}


