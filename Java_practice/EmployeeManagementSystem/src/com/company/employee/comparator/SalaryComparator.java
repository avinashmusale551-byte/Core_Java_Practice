package com.company.employee.comparator;
import java.util.Comparator;
import com.company.employee.model.*;
public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee a, Employee b) {
		
		return Double.compare(a.getsalary(),b.getsalary());
	}
	

}
