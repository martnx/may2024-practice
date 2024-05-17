package CalculatorUsingSwitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int operators = 0;
		
		System.out.print("First Number: ");
		num1 = scan.nextInt();
		
		System.out.print("Second Number: ");
		num2 = scan.nextInt();
		
		System.out.print("Choose Operators: ");
		operators = scan.nextInt();
		
		int result = 0;
		switch(operators) {
			case 1: result = num1 + num2; break;
			case 2: result = num1 - num2; break;
			case 3: result = num1 * num2; break;
			case 4: result = num1 / num2; break;
			default: 
		}
	
		System.out.println("Result: "+ result);
	}

}
