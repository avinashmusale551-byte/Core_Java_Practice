package com.company.employee.service;
import java.util.*;
import com.company.employee.model.*;
import com.company.employee.exception.*;
import com.company.employee.comparator.*;
import java.util.Iterator;

public class EmployeeService {
	
	private HashMap<Integer,Employee> emp=new HashMap<>();

	
	public void addEmployee(Employee e) throws Exception{
		
		if(emp.containsKey(e.getemployeeId())) {
			throw new DuplicateEmployeeException("Employee ID already exists.");
		}
		if(e.getname()==null||e.getname().trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		if(e.getage()<=18) {
			throw new InvalidAgeException("Enter age greater than 18.");
		}
		if (e.getsalary()<0) {
		    throw new InvalidSalaryException("Salary must be greater than 0");
		}
		if (emailExists(e.getemail(), -1)) {
            throw new DuplicateEmployeeException("Email already registered.");
        }
		emp.put(e.getemployeeId(),e);
		System.out.println("Employee added successfully.");
	}
	
	private boolean emailExists(String email, int exceptId) {
        if (email == null) return false;
        Iterator<Employee> it = emp.values().iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.getemployeeId() != exceptId && email.equalsIgnoreCase(e.getemail())) {
                return true;
            }
        }
        return false;
    }
	public void displayEmployees() {
		if(emp.isEmpty()) {
			System.out.println("No Employees found !");
			return;
		}
		Iterator<Employee> it= emp.values().iterator();
		while(it.hasNext()) {
			Employee ep=it.next();
			System.out.println(ep);
		}
	}
	  public Employee getEmployee(int id) throws EmployeeNotFoundException {
	        Employee e = emp.get(id);

	        if (e == null) {
	            throw new EmployeeNotFoundException(
	                "Employee with ID " + id + " does not exist."
	            );
	        }

	        return e;
	    }
	  
	  public void serachbyName(String name) {
		  
		  boolean found=false;
		  
		  Iterator<Employee> it=emp.values().iterator();
		  while(it.hasNext()) {
			  Employee e=it.next();
			  if(e.getname().equalsIgnoreCase(name)) {
				  System.out.println(e);
				  found=true;
			  }
		  }
		  if(!found) {
			  System.out.println("Employee not found !");
		  }
	  }
	  public void searchbyDepartment(String name) {
		  boolean found=false;
		  Iterator<Employee> it=emp.values().iterator();
		  while(it.hasNext()) {
			  Employee e=it.next();
			  if(e.getdepartment().equalsIgnoreCase(name)) {
				  System.out.println(e);
				  found =true;
			  }
		  }
		  if(!found) {
			  System.out.println("Department not found !");
		  }
	  }
	  
	  public void searchbyDesignation(String name) {
		  boolean found=false;
		  
		  Iterator<Employee> it=emp.values().iterator();
		  while(it.hasNext()) {
			  Employee e=it.next();
			  System.out.println(e);
			  found=true;
		  }
		  if(!found) {
			  System.out.println("Designation not found !");
		  }
	  }
	  public void updateEmployee(int id,Scanner sc) throws Exception{
		  Employee e=getEmployee(id);
		  boolean running=true;
		  while(running) {
			  System.out.println("\n1. Update Name");
	            System.out.println("2. Update Email");
	            System.out.println("3. Update Age");
	            System.out.println("4. Update Department");
	            System.out.println("5. Update Designation");
	            System.out.println("6. Update Salary");
	            System.out.println("7. Update All Details");
	            System.out.println("8. Back");
	            System.out.print("Enter choice: ");
	            
	            int choice=Integer.parseInt(sc.nextLine());
	            
	            switch(choice){
	            case 1:System.out.println("Enter new name:");
	            String name=sc.nextLine().trim();
	            if(name.isEmpty()) {
	            	System.out.println("Name Cannot be empty.");
	            }
	            else {
	            	e.setname(name);
	            	System.out.println("Name updated successfully.");
	            }
	            break;
	            
	            case 2:System.out.println("Enter new Email:");
	            String email=sc.nextLine().trim();
	            if(email.isEmpty()) {
	            	System.out.println("Email cannot be empty.");
	            }
	            else if(emailExists(email,id)){
	            	System.out.println("Email is already registered.");
	            }
	            else {
	            	e.setemial(email);
	            	System.out.println("Email updated.");
	            }
	            break;
	            
	            case 3:System.out.println("Enter new Age:");
	            int age=Integer.parseInt(sc.nextLine());
	            if (age <= 18) {
                    throw new InvalidAgeException("Age must be greater than 18.");
                }

                e.setage(age);
                System.out.println("Age updated.");
                break;
                
	            case 4:
                    System.out.print("Enter new department: ");
                    String dept = sc.nextLine().trim();

                    if (dept.isEmpty()) {
                        System.out.println("Department cannot be empty.");
                    } else {
                        e.setdepartment(dept);
                        System.out.println("Department updated.");
                    }
                break;
                
	            case 5:
                    System.out.print("Enter new designation: ");
                    String designation = sc.nextLine().trim();

                    if (designation.isEmpty()) {
                        System.out.println("Designation cannot be empty.");
                    } else {
                        e.setdesignation(designation);
                        System.out.println("Designation updated.");
                    }
                break;
                
	            case 6:
                    System.out.print("Enter new salary: ");
                    double salary = Double.parseDouble(sc.nextLine());

                    if (salary < 0) {
                        throw new InvalidSalaryException(
                            "Salary cannot be negative."
                        );
                    }

                    e.setsalary(salary);
                    System.out.println("Salary updated.");
                 break;
                 
	            case 7:
                    System.out.print("Enter new name: ");
                    String n = sc.nextLine().trim();

                    System.out.print("Enter new email: ");
                    String em = sc.nextLine().trim();

                    System.out.print("Enter new age: ");
                    int a = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter new department: ");
                    String d = sc.nextLine().trim();

                    System.out.print("Enter new designation: ");
                    String des = sc.nextLine().trim();

                    System.out.print("Enter new salary: ");
                    double s = Double.parseDouble(sc.nextLine());
                    
                    if (n.isEmpty() || em.isEmpty()
                            || d.isEmpty() || des.isEmpty()) {
                        System.out.println("Text fields cannot be empty.");
                        break;     
                        }
                    if (a <= 18) {
                        throw new InvalidAgeException("Age must be greater than 18.");
                    }
                    if (s < 0) {
                        throw new InvalidSalaryException("Salary cannot be negative.");
                    }
                    if (emailExists(em, id)) {
                        System.out.println("Email already registered.");
                        break;
                    }
                    e.setname(n);
                    e.setemial(em);
                    e.setage(a);
                    e.setdepartment(d);
                    e.setdesignation(des);
                    e.setsalary(s);
                    
                    System.out.println("All details updated");
                    break;
                    
	            case 8:
	            	running=false;
	            	break;
	            	
	            	default:
	            		System.out.println("Invalid choice");
		  }
	  }
}
	 
	  
	  
	  
	    public void deleteEmployee(int id) throws EmployeeNotFoundException{
	    	if(!emp.containsKey(id)) {
	    		throw new EmployeeNotFoundException("Employee with ID " + id + " does not exist.");
	    	}
	    	Iterator<Map.Entry<Integer, Employee>> itr=emp.entrySet().iterator();
	    	while(itr.hasNext()) {
	    		Map.Entry<Integer, Employee> entry=itr.next();
	    		if(entry.getKey()==id) {
	    			itr.remove();
	    			System.out.println("Employee deleted Successfulyy.");
	    			return;
	    		}
	    	}
	    }
	    public void sortEmployee(int choice,boolean descending) {
	    	ArrayList<Employee> list=new ArrayList<>(emp.values());
	    	
	    	switch(choice){
	    	case 1:
	    		Collections.sort(list);
	    		break;
	    	case 2:
	    		list.sort(new NameComparator());
                break;
	    	case 3:
	    		list.sort(new SalaryComparator());
	    	case 4:
	    		list.sort(new AgeComparator());
	    		break;
	    	case 5:
	    		list.sort(new Comparator<Employee>(){
	    			public int compare(Employee a,Employee b) {
	    				return a.getdepartment().compareToIgnoreCase(b.getdepartment());
	    			}
	    		});
	    		break;
	    		
	    		default: System.out.println("Invalid sorting choice.");
	    		return;
	    	}
	    	if(descending) {
	    		Collections.reverse(list);
	    	}
	    	Iterator<Employee> printitr=list.iterator();
	    	while(printitr.hasNext()) {
	    		Employee e=printitr.next();
	    		System.out.println(e);
	    	}
	    }
	    public void statistics() {
	    	if(emp.isEmpty()) {
	    		System.out.println("No employees Found !");
	    		return;
	    	}
	    	double total=0;
	    	double highest=Double.NEGATIVE_INFINITY;
	    	double lowest=Double.POSITIVE_INFINITY;
	    	
	    	HashMap<String,Integer> counts=new HashMap<>();
	    	Iterator<Employee> stat=emp.values().iterator();
	    	while(stat.hasNext()) {
	    		Employee e=stat.next();
	    		total=total+e.getsalary();
	    		if(e.getsalary()>highest) {
	    			highest=e.getsalary();
	    		}
	    		if(e.getsalary()<lowest) {
	    			lowest=e.getsalary();
	    		}
	    		String dept = e.getdepartment();
	    		counts.put(dept, counts.getOrDefault(dept, 0)+1);
	    	}
	    	System.out.println("Total Employees: "+emp.size());
	    	
	    	Iterator<String> depitr=counts.keySet().iterator();
	    	while(depitr.hasNext()) {
	    		String dep=depitr.next();
	    		System.out.println(dep+"Employees:"+counts.get(dep));
	    	}
	    	System.out.println("Highest Salary:"+highest);
	    	System.out.println("Lowest Salary:"+lowest);
	    	System.out.println("Average Salary:"+total/emp.size());
	    }
	    public void employeesSalaryRange(double min, double max) {
	        Iterator<Employee> rangeitr = emp.values().iterator();
	        while (rangeitr.hasNext()) {
	            Employee e = rangeitr.next();
	            if (e.getsalary() >= min && e.getsalary() <= max) {
	                System.out.println(e);
	            }
	        }
	    }
	    public void HighestPaiEmployee() {
	    	Employee highest=null; 
	    Iterator<Employee> salaryItr = emp.values().iterator();
        while (salaryItr.hasNext()) {
            Employee e = salaryItr.next();
            if (highest == null || e.getsalary() > highest.getsalary()) {
                highest = e;
            }
        }
        if (highest == null) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Highest Paid Employee:");
            System.out.println(highest);
        }
    }
	    
	    public void exportReport() throws java.io.IOException {
	    	
	        java.io.PrintWriter writer = new java.io.PrintWriter("employee-report.txt");
	        Iterator<Employee> fileItr = emp.values().iterator();
	        while (fileItr.hasNext()) {
	            Employee e = fileItr.next();
	            writer.println(e);
	        }
	        writer.close();
	        System.out.println("Report saved to employee-report.txt");
	    }
	    public ArrayList<Employee> getEmployees() {
	        return new ArrayList<>(emp.values());
	    }   
}
