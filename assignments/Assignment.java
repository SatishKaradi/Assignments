package com.te.javaassignments.common;

import java.util.Scanner;

public class Assignment {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the month :");
	String month = scanner.next();
	System.out.println("Enter the year :");
	int year =scanner.nextInt();
	switch(month) {
		
		 case "january": System.out.println("january having 31 days"); 
		 break; 
	     case "february":
	    	  if((year%4==0 && year%100!=0)||(year%400==0)){	
			   System.out.println("february having 29 days");
			   }else {			
				System.out.println("february having 28 days");
			}			  
		  break;
		  case "march": System.out.println("march having 31 days");
		  break;
		  case "april":
		  System.out.println("april having 30 days");
		  break; 
		  case "may":
		  System.out.println("may having 31 days"); 
		  break; 
		  case "june":
		  System.out.println("may having 30 days"); 
		  break;
		  case "july":
		  System.out.println("july having 31 days");
		  break;
		  case "august":
		  System.out.println("august having 31 days");
		  break; 
		  case "september":
		  System.out.println("september having 30 days");
		  break; 
		  case "october":
		  System.out.println("october having 31 days"); 
		  break;
		  case "november":
		  System.out.println("november having 30 days");
		  break;
		  case "december":
		  System.out.println("december having 31 days"); 
		  break;
		 
		  default:
			  System.out.println("Enter valid month");
	     }
		
	      if((year%4==0 && year%100!=0)||(year%400==0)){
		  System.out.println(year+" is a leap year"); }else {
		  System.out.println(year+" is not a leap year"); }
		       }
}
