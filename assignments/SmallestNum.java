package com.te.javaassignments.common;

public class SmallestNum {
	public static void main(String[] args) {

		int a[] = { 2, 4, 1, 7, 9 };
		int small = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < small) {
				small= a[i];				
			}
		}
		System.out.println(small+" is a smallest number");
	}
}
