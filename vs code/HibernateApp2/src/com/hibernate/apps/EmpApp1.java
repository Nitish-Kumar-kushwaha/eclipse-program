package com.hibernate.apps;

import java.util.List;
import java.util.Scanner;

import com.hibernate.model.Employee;
import com.hibernate.operations.EmpOperations;

public class EmpApp1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		EmpOperations eo = new EmpOperations();
		while (true) {

			System.out.println("\n1 to add \n2. show All \n3search \n4 Exit \n5 Delete");
			
			System.out.println("entre choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("empno");
				emp.setEmpno(sc.nextInt());
				System.out.println("name");
				emp.setEname(sc.next());
				System.out.println("job");
				emp.setJob(sc.next());
				System.out.println("salary");
				emp.setSalary(sc.nextFloat());
				
				eo.addEmployeee(emp);
				System.out.println("Employee is added");
				break;
			case 2:
				List<Employee> empall = eo.showAll();
				
				for(Employee e : empall) {
					System.out.println(e.getEmpno()+"\t"+e.getEname()+"\t"+e.getJob()+"\t"+e.getSalary());
				}
				break;
			
			case 3:
				System.out.println("entre Employee number");
				int eno = sc.nextInt();
				Employee oneEmp = eo.SearchEmpBasedEmpNo(eno);
				if(oneEmp != null) {
					System.out.println(oneEmp.getEmpno()+"\t"+oneEmp.getEname()+"\t"+oneEmp.getJob()+"\t"+oneEmp.getSalary());
				}
				else {
					System.out.println("employee is not found");
				}
				break;
			case 4: 
				System.out.println("Thanks for using APP");
				System.exit(0);
			
			case 5: 
				System.out.println("entre empno to be deleted");
				int no = sc.nextInt();
				int res = eo.DeleteEmployee(no);
				if(res>0) {
					System.out.println("deleted !!!!");
				}
				else {
					System.out.println("Not Found !!!!");
				}
				

			default:
				System.out.println("wrong choice");
				break;
			}
			
		}
		
	}

}
