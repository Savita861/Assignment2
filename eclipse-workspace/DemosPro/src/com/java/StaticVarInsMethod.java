package com.java;

public class StaticVarInsMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tests obj = new Tests();
		obj.disp();
	}
}
		
		class Tests{
	
	static int add() {          //static method
	
		int x = 10, y =20;		//local variable
		int z = x+y;
		return z;
		
	}
	
	void disp() {          //Instance method
		
		@SuppressWarnings("unused")
		int a = add();    //calling static method
		
		}

}
