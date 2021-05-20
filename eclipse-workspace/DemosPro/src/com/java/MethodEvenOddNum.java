package com.java;

public class MethodEvenOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] myArray = {23,93,56,92,39};
		System.out.println("Even number in the given array are ::");
		
		for(int i = 0; i<myArray.length; i++) {
			
			if(myArray[i]%2==0)
			{
				System.out.println(myArray[i]);
			}
		}
	}

}
