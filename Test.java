package com.imt;

public abstract class Test {
	public static void main(String args[]){
		Test1 a=new Test1();
		a.add();
		a.sub();
		System.out.println(a.x);
	}
	abstract void add();
	abstract void sub();
	int x=4;
	Test()
	{ System.out.println("hello");
	}

}
class Test1 extends Test{
	void add()
	{
		System.out.println("add() in Test1 class");
	}
	void sub()
	{
		System.out.println("sub() in Test1 class");	
	}
	Test1()
	{
		System.out.println("default cons");
		
	}

}
