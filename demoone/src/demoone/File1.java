package demoone;

import java.util.*;
import java.io.FileInputStream;

public class File1 {
	
	
	    public static void main(String[] args) {
	        try {
	            FileInputStream input = new FileInputStream("input1.txt");
	            System.out.println("Data is:-");
	            int i = input.read();
	            while(i!=-1) {
	                System.out.print(i);
	                i = input.read();
	            }
	            System.out.println("closing file:-");
	            input.close();
	        }
	        catch(Exception e) {
	            System.out.println("oops problem is there!!!");
	            System.out.println(e);
	            e.getStackTrace();
	        }
	    }}
	
