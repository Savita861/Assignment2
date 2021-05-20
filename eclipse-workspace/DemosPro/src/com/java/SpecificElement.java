package com.java;

import java.util.Arrays;

public class SpecificElement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array_num = {12,12,12,23,23,23,12};
		System.out.println("Original Array :"+Arrays.toString(array_num));
		
		int num1 = 12;
		int num2 = 23;
		
		System.out.println("Result :"+result(array_num, num1, num2));
		
	}
	public static boolean result(int[] array_nums, int num1, int num2) {
		for(int number : array_nums) {
			boolean r = number !=num1 && number !=num2;
			if(r) {
				return false;
				
			}
		}
		return true;
	}

}
