package com.te.assignmentstudent.common;

import java.util.Comparator;

public class CompareByMarks implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
	
		return arg0.marks-arg1.marks;
	}

}
