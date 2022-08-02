package com.bilgeadam.boost.Java101.salarycalculator;

public class Main {

	public static void main(String[] args) {
		
		
		Employee e = new Employee("Eda",12000,45,2005);
		
		e.printEmployee();
		e.tax();
		e.bonus();
		e.raiseSalary();
	}

}
