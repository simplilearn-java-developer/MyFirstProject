package com.simplilearn.fsd._01_operators._01_arithmetic;

public class Arithmetic {

	public static void main(String[] args) {

		int a = 8;
		int b = 2;
		
		int sum = a + b;
		int sub = a - b;
		double div = (double)a / b;
		int mul = a * b;
		
		System.out.println("Addition is " + sum);
		System.out.println("Subtraction is " + sub);
		System.out.println("Division is " + div);
		System.out.println("Multiplication is " + mul);
	
		int mod = a % b; /* Returns the remainder*/
		System.out.println("Modulus is " + mod);
		
		
	}

}
