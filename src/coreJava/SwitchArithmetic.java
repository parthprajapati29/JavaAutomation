package coreJava;

import java.util.Scanner;

public class SwitchArithmetic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter operation that you wanna perform \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Mod(%):");
		int c = sc.nextInt();
		
	
		switch(c) {
		case 1:
			System.out.println("a+b = "+(a+b));
			break;
		case 2:
			System.out.println("a-b = "+(a-b));
			break;
		case 3:
			System.out.println("a*b = "+(a*b));
			break;
		case 4:
			System.out.println("a/b = "+(a/b));
			break;
		case 5:
			System.out.println("a%b = "+(a%b));
			break;
		
		default:
			System.out.println("Invalid");
		}
	}
}
