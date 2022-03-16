package com.te.assignmentstudent.common;

public class Student implements Comparable<Student>{
int rollno;
String name;
int age;
int marks;


public Student(int rollno, String name, int age, int marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
	this.marks = marks;
}

@Override
public int compareTo(Student arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
}


}
