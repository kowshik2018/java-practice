package com.calculator;

import java.util.Scanner;

public class Simplecalculator {
public static void main(String[] args) {
	Scanner sc2=new Scanner(System.in);
	double fnum,snum,answer;
	System.out.println("Enter first number:");
	fnum=sc2.nextDouble();
	System.out.println("Enter second number:");
	snum=sc2.nextDouble();
	System.out.println("Answer is:");
	answer=fnum+snum;
	System.err.println(answer);
}
}
