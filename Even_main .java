package com.Lambda_Expressions;
import java.util.*;
public class Even_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Even_check e=(int a)->
		{
			if(a%2==0)
			{
				System.out.println("It is even");
			}
			else
			{
				System.out.println("It is odd");
			}
		};
		System.out.println("Enter the number");
		int num=sc.nextInt();
		e.check(num);
		}
	}
