package core_concepts.oops;

import java.util.Scanner;

class Car{
	public void start(){
		System.out.println("started car");
	}
	public void stop(){
		System.out.println("Stoping car");
	}
}

class Benz extends Car{
	@Override
	public void start() {
		System.out.println("starting benz car");
	}
	
	@Override
	public void stop() {
		System.out.println("stoping benz car");
	}
}

class Maruthi extends Car{
	@Override
	public void start() {
		System.out.println("starting Maruthi");
	}
	
	@Override
	public void stop() {
		System.out.println("stoping Maruthi car");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Car car = null;
		Scanner scanner = new Scanner(System.in);
		String carname = scanner.nextLine();
		if (carname.equalsIgnoreCase("maruthi")){
			car = new Maruthi();
		}else{
			car = new Benz();
		}
		car.start();
		car.stop();
	}
}
