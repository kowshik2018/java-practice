package com.runnable;

public class Main {
public static void main(String[] args) {
    HelloThread th1=new HelloThread();
    HelloThread th2=new HelloThread();
	System.out.println(th1);
	System.out.println(th2);
	
	
	/*HelloThread th2=new HelloThread("imtiyaz khan");
	System.out.println(th2);
	
	ThreadGroup tg=new ThreadGroup("saravan");
	HelloThread th3=new HelloThread( tg,"A");
	System.out.println(th3);
	*/
	/*try{
		for(int i=0;i<3;i++){
			System.out.println("Hello Friends"+"\t"+Thread.currentThread().getName());
			Thread.sleep(4000);
			System.out.println("Hello Students"+"\t"+Thread.currentThread().getThreadGroup().getName());
			System.out.println(th3);
		}
	}catch(Exception e){
		e.printStackTrace();
	}*/
}
}


class HelloThread implements Runnable{
	
	HelloThread(){
		Thread t1=new Thread(this);
		t1.start();
	}
	
	
	/*HelloThread(String tname){
		Thread t1=new Thread(this,tname);
		t1.start();
	}
	
	
	HelloThread(ThreadGroup tg,String tname){
		Thread t1=new Thread(tg,this);
		t1.start();
	}*/
	public void run(){
		try{
		for(int i=0;i<5;i++){
				System.out.println("Hello dude"+"\t"+Thread.currentThread().getName());
				Thread.sleep(4000);
				System.out.println("Hello guys"+"\t"+Thread.currentThread().getThreadGroup().getName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}


