package com.Lambda_Expressions;
import java.util.*;
public class Calci_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calci c=(int a,int b)->
		{
			System.out.println("Sum is:"+(a+b));
		};
		System.out.println("Enter the first number");
		int a1=sc.nextInt();
		System.out.println("Enter the second number");
		int b1=sc.nextInt();
		c.add(a1, b1);
	}
}
