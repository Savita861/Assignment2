package com.java;

public class splitExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "java string split method by javapoint";
		
		String[] words = s1.split("\\s"); //split the string based on whitespace
		
		for(String w:words) {
			
			System.out.println(w);
		}
		
	}

}
