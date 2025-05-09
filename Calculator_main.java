package com.Lambda_Expressions;
import java.util.*;
public class Calculator_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator sum=(int a,int b)->
		{
			return a+b;
		};
		Calculator sub=(int a,int b)->
		{
			return a-b;
		};
		Calculator mul=(int a,int b)->
		{
			return a*b;
		};
		Calculator div=(int a,int b)->
		{
			return a/b;
		};
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		System.out.println("sum:"+(sum.operation(n1,n2)));
		System.out.println("sub:"+(sub.operation(n1,n2)));
		System.out.println("mul:"+(mul.operation(n1,n2)));
		System.out.println("div:"+(div.operation(n1,n2)));
	}
}
