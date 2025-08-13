package com.imt;

public class HelloThread {
	public static void main(String[] args) {
		System.out.println("*************start of main()");
		Thread th=Thread.currentThread();
		System.out.println(th);
		System.out.println(th.getName());
		Thread t1=new Thread();
		Thread t2=new Thread();
		System.out.println(t1);
		System.out.println(t2);
		t1.setName("kumar");
		System.out.println(t1);
		th.setName("mona");
        System.out.println(th);	
        
         th.setPriority(10);
        System.out.println(th);
         System.out.println(th.getPriority());
        System.out.println(th.getThreadGroup());
        System.out.println(th.getName());
        
        th.setPriority(8);
        System.out.println(th.getPriority());
            
		Thread t3=new Thread();
		System.out.println(t3);

	}

}
