package com.bilgeadam.boost.Java101.salarycalculator;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	public void tax() {
		
		if (this.salary<1000) {
			
			System.out.println("Your salary is not in the tax bracket. ");
			
		} else if (this.salary>1000) {
			
			System.out.println("Tax: "+ this.salary*0.03);
			
			
		}
	}
	
	public void bonus() {
		
		if(this.workHours>40) {
			
			int extraHours = this.workHours-40;
			double extraSalary = extraHours*30;
			
			
			System.out.println("Your bonus this month: " + extraSalary );
		}
		else {
			
			System.out.println("You have no bonus this month.");
		}
		
	}
	
	public void raiseSalary() {
		
		int workTime = 2021-this.hireYear;
		
		if(workTime<10) {
			
			double riseSalary = this.salary*0.05;
			System.out.println("Your salary increase: "+ riseSalary);
			System.out.println("Your salary after the raise: "+Math.round(this.salary+riseSalary));
			
		}
		else if((workTime>9)  &&  (workTime<20)) {
			
			double riseSalary = this.salary*0.1;
			System.out.println("Your salary increase: "+ riseSalary);
			System.out.println("Your salary after the raise: "+Math.round(this.salary+riseSalary));
		}
		else if(workTime>19) {
			
			double riseSalary = this.salary*0.15;
			System.out.println("Your salary increase: "+ riseSalary);
			System.out.println("Your salary after the raise: "+Math.round(this.salary+riseSalary));
			
		}
		
	}
	
	
	public void printEmployee() {
		
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
		System.out.println("Working hour: "+this.workHours);
		System.out.println("Hire year: "+this.hireYear);

	}
	
	
}
