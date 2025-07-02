package practice;

//import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Car car = new Car("Ford Focus",20000,"V6");
		//car.showDetails();
		
		System.out.println(car.engine.type);
	
		
		car.start();
		car.stop();
	}
}
