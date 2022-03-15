package com.te.assignmentstudent.common;

import java.util.Comparator;

public class CompareByMarks implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.address.compareTo(arg1.address);
	}

}
