package org.sample;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no: ");
	int n = s.nextInt();
	int i=0,j=0;
	int a=n;
	while(a>0)
	{
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	
	System.out.println("Reverse of a given no is: "+j);
	if(n==j)
	{
		System.out.println("Given no is palindrome no");
	}
	else
	{
		System.out.println("Given no is not palindrome");
	}
	}
}
