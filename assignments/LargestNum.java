package com.te.javaassignments.common;
public class LargestNum {
	public static void main(String[] args) {

	    int a[]= {2,4,1,7,9};
	    int large=a[0];

	    for(int i=1;i<a.length;i++) {
	         if(a[i]>large) {
	    	 large=a[i];
	         }    
	      }
		  System.out.println("Largest num in the array: "+large);
		}
	}


