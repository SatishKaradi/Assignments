package com.te.assignmentstudent.common;

import java.util.Comparator;

public class CompareByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
	return arg0.rollno-arg1.rollno;
	
	
	}

	

}
