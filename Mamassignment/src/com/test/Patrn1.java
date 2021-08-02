package com.test;

public class Patrn1 {
	
	  public static void main(String[] args)

	  {
	        for (int i = 1; i <= 4; i++)
	        {
	            for (int j = 4 - i; j >= 1; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++)
	            {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	    }
	            
}