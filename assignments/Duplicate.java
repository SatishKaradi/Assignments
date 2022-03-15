package com.te.javaassignments.common;

public class Duplicate {
	public static void main(String[] args) {
		int a[] = { 2,2, 4, 6, 6,5, 1 };
		int duplicate = 0;

	
		for (int i = 0; i < a.length; i++) {
			int temp=0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i!=j) {
				temp++;
				a[j]='\n';
				}}
			if(a[i]!='\n'&&  temp>0) {
				System.out.println(a[i]);
			}
			}
		}
}

	

