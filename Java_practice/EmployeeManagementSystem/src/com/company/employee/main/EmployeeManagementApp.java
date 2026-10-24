package com.company.employee.main;
import java.util.*;
import com.company.employee.model.*;
import com.company.employee.service.*;

public class EmployeeManagementApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		DepartmentService depservice=new DepartmentService();
		
		boolean running=true;
		
		while(running) {
			try {
				System.out.println("\n=================================================");
				System.out.println(" 	  EMPLOYEE MANAGEMENT SYSTEM		");
				System.out.println("\n=================================================");
				
				System.out.println("1.Add Employees");
				System.out.println("2.Display all employees");
				System.out.println("3.Search employees");
				System.out.println("4.Update employees");
				System.out.println("5.Delete employees");
				System.out.println("6.Display employees by department");
				System.out.println("7.Display employees by designation");
				System.out.println("8.Sort employees");
				System.out.println("9.Employee statistics");
				System.out.println("10.Department management");
				System.out.println("11.Exit");
				System.out.println("Enter your choice: ");
				
				int choice=Integer.parseInt(sc.nextLine());
				
				switch (choice) {
				case 1:
					System.out.println("Enter employee id: ");
					int id=Integer.parseInt(sc.nextLine());
					
					System.out.println("Enter name: ");
					String name=sc.nextLine();
					
					System.out.println("Enter email id: ");
					String email=sc.nextLine();
					
					System.out.println("Enter age: ");
					int age=Integer.parseInt(sc.nextLine());
					
					System.out.println("Enter department: ");
					String dep=sc.nextLine();
					
					System.out.println("Enter designation: ");
					String des=sc.nextLine();
					
					System.out.println("Enter salary: ");
					double sa=Double.parseDouble(sc.nextLine());
					
					Employee e=new Employee(id,name,email,age,dep,des,sa);
					service.addEmployee(e);
					break;
					
				case 2:
					service.displayEmployees();
					break;
					
				case 3:
					 System.out.println("1. Search By ID");
                     System.out.println("2. Search By Name");
                     System.out.println("3. Search By Department");
                     System.out.println("4. Search By Designation");
                     System.out.print("Enter choice: ");
                     
                     
                     int searchchoice=Integer.parseInt(sc.nextLine());
                     
                     switch(searchchoice) {
                     case 1:
                    	 System.out.print("Enter Id: ");
                    	 int sid=Integer.parseInt(sc.nextLine());
                    	 System.out.println(service.getEmployee(sid));
                    	 break;
                     case 2:
                    	 System.out.println("Enter name: ");
                    	service.serachbyName(sc.nextLine());
                    	break;
                     case 3:
                    	 System.out.print("Enter Department: ");
                         service.searchbyDepartment(sc.nextLine());
                         break;
                     case 4:
                    	 System.out.println("Enter Designation: ");
                    	 service.searchbyDesignation(sc.nextLine());
                    	 break;
                    	 default:
                    		 System.out.println("Invalid choice.");
                     }
                     break;
                     
				case 4:
					System.out.println("Enter employee id to update: ");
					int uid=Integer.parseInt(sc.nextLine());
					service.updateEmployee(uid, sc);
					break;
					
				case 5:
					System.out.println("Enter employee id to delete: ");
					int did=Integer.parseInt(sc.nextLine());
					
					System.out.println("Are you sure?");
					System.out.println("1(Yes)");
					System.out.println("2(No)");
					int confirm=Integer.parseInt(sc.nextLine());
					
					if(confirm==1) {
						service.deleteEmployee(did);
					}
					else{
						System.out.println("deletion cancelled.");
					}
					break;
					
				case 6:
					System.out.println("Enter department: ");
					service.searchbyDepartment(sc.nextLine());
					break;
					
				case 7:
					System.out.println("Enter designation: ");
					service.searchbyDesignation(sc.nextLine());
					break;
					
				case 8:
					System.out.println("1. Sort By Employee ID.");
					System.out.println("2. Sort By Name.");
					System.out.println("3. Sort By Salary.");
					System.out.println("4. Sort By Age.");
					System.out.println("5. Sort By Department.");
					
					int sortchoice=Integer.parseInt(sc.nextLine());
					
					System.out.println("1.Ascending.");
					System.out.println("2.Descending.");
					int order=Integer.parseInt(sc.nextLine());
					
					if(sortchoice>=1 && sortchoice<=5 &&(order==1 ||order==2)) {
						service.sortEmployee(sortchoice, order==2);
					}
					else {
						System.out.println("Invalid Choice !");
					}
					break;
					
				case 9:
					service.statistics();
					
					System.out.println("\n Bonus Operation: \n ");
					
					System.out.println("1. Highest Paid Employee");
                    System.out.println("2. Employees Within Salary Range");
                    System.out.println("3. Export Employee Report");
                    System.out.println("4. Back");
                    
                    System.out.print("Enter choice: ");
                    
                    int bonus=Integer.parseInt(sc.nextLine());
                    switch(bonus) {
                    case 1:
                    	service.HighestPaiEmployee();
                    	break;
                    	
                    case 2:
                    	System.out.println("Minimum Salary: ");
                    	double min=Double.parseDouble(sc.nextLine());
                    	
                    	System.out.println("Maximum Salary: ");
                    	double max=Double.parseDouble(sc.nextLine());
                    	
                    	 if (min > max) {
                             System.out.println(
                                 "Minimum cannot exceed maximum."
                             );
                         } else {
                             service.employeesSalaryRange(min, max);
                         }
                         break;
                         
                    case 3:
                    	service.exportReport();
                    	break;
                    	
                    case 4:
                    	break;
                    	
                    default:
                    	System.out.println("Invalid choice.");
                    	}
                    break;
                    
				case 10:
					boolean deprunning=true;
					while(deprunning) {
						System.out.println("\n DEPARTMENT MANAGEMENT \n");
						 System.out.println("1. Add Department");
                         System.out.println("2. Display Departments");
                         System.out.println("3. Search Department");
                         System.out.println("4. Remove Department");
                         System.out.println("5. Back");
                         
                         System.out.print("Enter choice: ");
                         
                         int dc=Integer.parseInt(sc.nextLine());
                         
                         switch(dc) {
                         case 1:
                        	 System.out.println("Department name: ");
                        	 depservice.adddepartment(sc.nextLine());
                        	 break;
                         case 2:
                        	 depservice.displaydepartment();
                        	 break;
                         case 3:
                        	 System.out.println("Department name: ");
                        	 depservice.searchdepartment(sc.nextLine());
                        	 break;
                         case 4:
                        	 System.out.println("Department name: ");
                        	 depservice.removedepartment(sc.nextLine());
                        	 break;
                         case 5:
                        	 deprunning=false;
                        	 break;
                        	 
                         }
                    }
				case 11:
					running=false;
					System.out.println("HAVE NICE DAY 👍");
					break;
					default:
						System.out.println("Invalid choice !try again");
				}
			}
			catch(NumberFormatException ex) {
				System.out.println("Invalid input ! enter valid number.");
			}catch(Exception ex) {
				System.out.println("Error:"+ex.getMessage());
			}
		}
		sc.close();

	}

}
