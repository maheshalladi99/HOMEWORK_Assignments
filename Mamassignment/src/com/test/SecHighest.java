package com.test;

public class SecHighest{  
public static int getSecondLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
}  
public static void main(String args[]){  
int array[]= {23,24,25,2,45};  
 
System.out.println("Second Largest: "+getSecondLargest(array,array.length));  
  
}}
