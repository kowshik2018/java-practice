package com.geetha;

public class Teacher {
	float v=45.56f;// instance variable declaration and defnitions
	int y;//instance variable
	static int x=89;//static variable
	
	 void m1(){
		 int x=47;//local variable
		 System.out.println(x);
	 }
	
	static void m2(){
		int b=789;//local variable
		System.out.println(b);
	}
	
	Teacher(){
		int g=67;//local variable
		System.out.println("default cons:"+g);
	}
	
	Teacher(int n){
		System.out.println("parameterized constructor:"+n);
	}
	
	{
		System.out.println("instance block");
	}
	
	static{
		System.out.println("static block **************");
	}
}
class Student extends Teacher{
	
	
	float v=45.56f;// instance variable declaration and defnitions
	int y;//instance variable
	static int x=89;//static variable
	
	 void m1(){
		 int x=47;//local variable
		 System.out.println(x);
	 }
	
	static void m2(){
		int b=789;//local variable
		System.out.println(b);
	}
	
	Student(){
		int g=67;//local variable
		System.out.println("default cons:"+g);
	}
	
	Student(int n){
		System.out.println("parameterized constructor:"+n);
	}
	
	{
		System.out.println("instance block");
	}
	
	static{
		System.out.println("static block **************");
	}
}
class Main{
	
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		System.out.println(Teacher.x);
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		
		
	}
	
	
	
}