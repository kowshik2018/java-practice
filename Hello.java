package com.imt.String;

public class Hello {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	StringBuffer sb1=new StringBuffer(25);
	StringBuffer sb2=new StringBuffer("imtiyaz");
	System.out.println(sb.capacity());
	System.out.println(sb1.capacity());
	System.out.println(sb2.capacity());
	System.out.println(sb2.append("khan"));
	System.out.println(sb.append("adcyeuhydfisoidjak"));
	System.out.println(sb1.capacity());
	System.out.println(sb.append("ggghhjhjhffdhgjkhhk,jhhvgfvhnbbmjnbmhgfgxfchbmm,n,jh"));
	System.out.println(sb1.capacity());
	sb.ensureCapacity(19);
	System.out.println(sb.capacity());
	
	}
}
