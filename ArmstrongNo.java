package org.sample;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = s.nextInt();
		int a=n;
		int i=0,j=0;
		while(a>0)
		{
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
		}
		if(n==j)	
		{
			System.out.println("Armstrong no");
		}
		else{
			System.out.println("Not armstrong no");
		}
			
		
	}

}
