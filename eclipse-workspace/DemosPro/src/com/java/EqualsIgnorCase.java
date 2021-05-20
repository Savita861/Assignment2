package com.java;

public class EqualsIgnorCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "javapoint";
		String s2 = "javapoint";
		String s3 = "JAVAPOINT";
		String s4 = "python";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
