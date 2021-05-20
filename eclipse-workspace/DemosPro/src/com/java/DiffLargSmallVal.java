package com.java;

import java.util.Arrays;

public class DiffLargSmallVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array_nums = {5,7,2,4,9};
		System.out.println("Original Array :"+Arrays.toString(array_nums));
		
		int max_val = array_nums[0];
		int min = array_nums[0];
		
		for(int i =0; i<array_nums.length; i++)
		{
			if(array_nums[i]>max_val)
				max_val = array_nums[i];
			else if(array_nums[i]< min)
				min = array_nums[i];
		}
		System.out.println("Different between largest and smallest value :"+(max_val-min));
	}

}
