package com.test;
import java.util.Scanner;
public class Mathsqrt {
	    public static void main(String[] args)  
	    { 
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); 
		scanner.close();
		double temp;

		double sr = num / 2;

		do {
			temp = sr;
			sr = (temp + (num / temp)) / 2;
		} while ((temp - sr) != 0);


		System.out.println("Square root of "+ num+ " is: "+sr);
	    }

}
