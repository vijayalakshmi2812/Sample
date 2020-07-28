package org.sample;

import java.util.Scanner;

public class AscendingArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int temp;
		int n = s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0;i<=n-1;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<=n-1;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(a[i]>a[j])
				{
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				
			}
		}
			
	}
		for(int i=0;i<n-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[n-1]);

}}
