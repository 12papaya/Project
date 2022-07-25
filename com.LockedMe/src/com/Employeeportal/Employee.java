package com.Employeeportal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	
	private static final boolean Empno = false;
	private int getEmpno;

	public Employee(int eno, String name, String email,int Phonenumber) {
		
	}
	public static void main(String[] args) {
		Collection<Employee> c =new ArrayList<Employee>();
		
		System.out.println("Welcome to Employee Portal");
		
		int ch;
		do {
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Delete");
			
			
			System.out.println("Enter Your Choice");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			
			Iterator<Employee> i;
			switch(ch){
			case 1:
				System.out.print("Enter Empno");
				int empno =sc.nextInt();
				System.out.print("Enter Name");
				String name =sc.next();
				System.out.print("Enter Personal Phone number");
				int Phonenumber =sc.nextInt();
				System.out.print("Enter Personal email");
				String email =sc.next();
				
				c.add(new Employee(empno, email, name,Phonenumber));
			break;
			case 2:
				System.out.println("..........");
				Iterator<Employee> i1 = c.iterator();
				i1 = c.iterator();
				while(i1.hasNext()) {
					Employee e = i1.next();
					System.out.println(e);
				}
				System.out.println("..........");
			case 3:
				boolean found =false;
				System.out.println("Enter Empno to Search");
				empno =sc.nextInt();
				   System.out.println("............");
				   i1=c.iterator();
				   while(i1.hasNext()){
					   Employee e =i1.next();
					   if(e.getEmpno()== Empno) {
					   System.out.println(e);
					   found = true;
					   }
				   }
				   
				   if(!found) {
					   System.out.println("Record not found");
				   }
				   System.out.println("............");
				break; 
			case 4:
				 found =false;
				System.out.println("Enter Empno to Delete");
				empno =sc.nextInt();
				   System.out.println("............");
				   i1=c.iterator();
				   while(i1.hasNext()){
					   Employee e =i1.next();
					   if(e.getEmpno()== Empno) {
					   i1.remove();
					   found = true;
					   }
				   }
				   
				   if(!found) {
					   System.out.println("Record not found");
				   }else {
					   System.out.println("Record is Deleted Successfully");
				   }
				   System.out.println("............");
				break;   
			    }
			  }while(ch!=0);			
			}

	private boolean getEmpno() {
		
		return false;
	}
	  }


