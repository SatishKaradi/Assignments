package com.te.javaassignments.common;
import java.util.Collection;
import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enterthe size");
	int n=scanner.nextInt();	
	for(int i=1;i<=n;i++) {
		for(int j=n;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
}
