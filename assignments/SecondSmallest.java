package com.te.javaassignments.common;

public class SecondSmallest {
	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 1, 6,0 };
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int e =  a.length-1; e >=0; e--) {
			if(a[e-1] != a[e]) {
				System.out.println(a[e-1]);
				break;
			}			
		}
 }
}