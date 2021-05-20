package com.java;

public class IndexOf {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String s1 = "This is IndexOf method";
		//passing substring and index
		
		int index1 = s1.indexOf("is");    //return the index of is substring
		int index2 = s1.indexOf("index"); //return the index of index substring
		
		System.out.println(index1+" "+index2); //2 8
		
		//passing substring with from index
		int index3 = s1.indexOf("is",4);   //return the index of is substring after 4th index
		System.out.println(index3);     //5 i.e, the index of another is
		
		//passing char value
		int index4 = s1.indexOf('s');
		System.out.println(index4); //3
		
		}

}
