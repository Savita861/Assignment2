package com.java;

public class MinMaxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] {10,11,88,2,120};
		
		//calling get-max method for getting max-value
		int max = getMax(array);
		System.out.println("Maximum value are :"+max);
		
		//calling get-min method for getting min-value
		int min = getMin(array);
		System.out.println("Minimum value are :"+min);
		
		
	}
	
	// Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	}
	

}
