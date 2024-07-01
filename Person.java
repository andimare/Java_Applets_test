package Exam;

import java.util.Scanner;

public class Person {
//	private:
		double height, salary;
		int age;
	
	Person(int a, double h){
		this.age = a;
		this.height = h;
	}
	
	//Mutator
	public void computeSal() {
		this.salary = (this.age/this.height)*10000;
		
		System.out.print("Print the salary: ");
		System.out.print(this.salary);
	}
	
	//Accessor
	public int getAge() {
		return this.age;
	}
	
	//Accessor
	public double getHeight() {
		return this.height;
	}
	

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
