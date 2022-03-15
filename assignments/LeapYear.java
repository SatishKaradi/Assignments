package com.te.javaassignments.common;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year");
	   int year  =	scanner.nextInt();
	   scanner.close();
//	   if((year%4==0&&year%100!=0)||(year%400==0))
	   if((year%4==0)||(year%400==0&&year%100!=0)){
		   System.out.println("leap year");
		}else {
			System.out.println("not a lea year");
		}
		
	}

}
