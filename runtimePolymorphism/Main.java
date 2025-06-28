package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.print("What animal are you choosing? 1 for Dog, 2 for Cat: ");
		num=sc.nextInt();
		
		if(num == 1) {
			dog.sound();
			dog.lives();
			dog.runs();
		}else {
			cat.sound();
			cat.lives();
			cat.runs();
		}
		sc.close();
	}
}
