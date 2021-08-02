package com.test;

import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		int sal;
		Scanner in = new Scanner(System.in);   
	      System.out.println("Salary :");  
	     sal = in.nextInt();  
	     
	     if (sal>=15150000) {
	    	 int s=100-30,amount;
	    	 
	    		amount= (s*sal)/100;
	    		System.out.println("income tax is:"+amount);
	     }
	     else if(sal>60000 && sal<150000) {
	    	 int s=100-20,amount;
	    	 
	    		amount= (s*sal)/100;
	    		System.out.println("income tax is:"+amount);
	     }
	     else if(sal>50000 && sal<=60000) {
	    	 int s=100-10,amount;
	    	 
	    		amount= (s*sal)/100;
	    		System.out.println("income tax is:"+amount);
	    	 
	     }
	     else {
	    	 System.out.println("income tax is:"+" nill");
	     }
	}

}
