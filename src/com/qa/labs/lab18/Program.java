package com.qa.labs.lab18;

import java.util.ArrayList;

public class Program {
	public static void main(String [] args) {
		
		Car c1 = new Car("bmw", 0);
		Car c2 = new Car("mazda", 0);
		RacingCar rc1 = new RacingCar("mercedes benz", 0, "Hamilton", 20);
		RacingCar rc2 = new RacingCar("ferrari", 0, "Leclerc", 30 );
		
		
		Car[] cars = {c1,c2,rc1,rc2};
		
		processCars(cars);
		
		Employee emp1 = new Employee("Guy", "picker");
		Employee emp2 = new Employee("John", "packer");
		SkilledWorker sw1 = new SkilledWorker("Dick", "money cleaner");		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(sw1);
		
		Manager manager = new Manager("Bob", "manager", employees);
		System.out.println(manager.getInfo());
	}
	public static void processCars(Car[] cars) {
		for (Car c : cars) {
			c.getToSixty();
			c.accelerate(2);
			System.out.printf("Model: %s, speed: %d", c.getModel(), c.getSpeed());
			if(c instanceof RacingCar) {
				RacingCar rc = (RacingCar) c;
				System.out.printf("Driver's name: %s, turboFact: %d", rc.getDriver(), rc.getTurboFactor());
			}
		}
	}
}
