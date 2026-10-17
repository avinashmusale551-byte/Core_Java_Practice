package com.company.employee.comparator;

import java.util.Comparator;
import com.company.employee.model.*;
public class NameComparator implements Comparator<Employee>{
	
	public int compare(Employee a,Employee b) {
		return a.getname().compareToIgnoreCase(b.getname());
	}
}
