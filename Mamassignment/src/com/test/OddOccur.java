package com.test;

public class OddOccur {

	public static void main(String[] args)
	{
		int arr[] = new int[]{ 1,2,8,9,8,10,7,8,2,1 };
		int n = arr.length;
		System.out.println(odd(arr, n));
	}

	static int odd(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++) {
			int count = 0;
			for (int j = 0; j < arr_size; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 != 0)
				return arr[i];
		}
		return -1;
	}
	
	

}
