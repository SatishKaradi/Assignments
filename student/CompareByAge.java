package com.te.assignmentstudent.common;

import java.util.Comparator;

public class CompareByAge implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.age-arg1.age;
	}

}
