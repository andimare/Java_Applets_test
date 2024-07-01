package Exam;

import java.util.Scanner;
//import Person;

public class Main {

	public static void main(String[] args) {

		int a;
		double h;

		Scanner age = new Scanner(System.in);
		
		System.out.print("Enter the age of the client: ");
		a = age.nextInt();
		
		System.out.print("Enter the height of the client: ");
		h = age.nextDouble();
		
		Person pr = new Person(a, h);
		
		pr.computeSal();
		
	}
}
