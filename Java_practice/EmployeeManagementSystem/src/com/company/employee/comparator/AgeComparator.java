package com.company.employee.comparator;
import java.util.Comparator;
import com.company.employee.model.*;
public class AgeComparator implements Comparator<Employee>{
	
	public int compare(Employee a,Employee b) {
		return Integer.compare(a.getage(), b.getage());
	}

}
