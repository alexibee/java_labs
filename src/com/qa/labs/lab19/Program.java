package com.qa.labs.lab19;

public class Program {
	public static void main(String[] args) {
		
		Fish fish = new Fish();
		Duck duck = new Duck("Quack");
		Penguin penguin = new Penguin("Peng");
		
		Animal [] animals = {fish, duck, penguin};
		
		for (Animal animal : animals) {
			if(animal instanceof Consumable) {
				Consumable consumableAnimal = (Consumable) animal;
				System.out.println(consumableAnimal.describeTaste());
				System.out.println(consumableAnimal.isMainCourseDish());
			}
		}
		
		for (Animal animal : animals) {
			if(animal instanceof Insurable) {
				Insurable insurableAnimal = (Insurable) animal;
				System.out.println(insurableAnimal.getPremium());
				System.out.println(insurableAnimal.expires());
			}
		}
	}
}
