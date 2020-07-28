package org.sample;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no: ");
	int n = s.nextInt();
	System.out.println("Factorialof a given no: ");
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of a given no is: "+fact);
	
	
	
	
	
	
	
	}
}
