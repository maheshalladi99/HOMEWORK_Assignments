package com.test;

import java.util.Scanner;

public class Powerof2 {
	public static void main(String[] args)   
	{
		int n;
		Scanner in = new Scanner(System.in);   
	      System.out.println("number :");  
	     n = in.nextInt();  
		if((int)(Math.ceil((Math.log(n) / Math.log(2)))) 
	            == (int)(Math.floor(((Math.log(n) / Math.log(2)))))) {
			System.out.println(n+" yes");
		}
	}

}
