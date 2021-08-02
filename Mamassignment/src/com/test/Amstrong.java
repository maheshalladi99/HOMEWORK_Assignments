package com.test;

import java.util.Scanner;

public class Amstrong {
	   public static void main(String args[]) {
	     
	      int number,check, rem, sum = 0;
	      System.out.println("Enter the number");
	      Scanner sc = new Scanner(System.in);
	      number = sc.nextInt();
	      check = number;
	      while(check != 0) {
	         rem = check % 10;
	         sum = sum + (rem * rem * rem);
	         check = check / 10;
	      }
	      if(sum == number)
	         System.out.println(number+"  is an armstrong number.");
	      else
	         System.out.println(number+"  is not an armstrong number.");
	   }
	}