package com.test;

import java.util.Scanner;

public class DupString {
	 public static void main(String argu[]) {

	  String str;
	  Scanner in = new Scanner(System.in);   
      System.out.println("Enter a String to find duplicates:");  
      str = in.nextLine();
	  int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicates are :");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	     System.out.println(inp[j]);
	     cnt++;
	     break;
	    }
	   }
	  }
	 }
	}
