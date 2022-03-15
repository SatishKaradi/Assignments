package com.te.assignmentstudent.common;

public class Student implements Comparable<Student>{
int rollno;
String name;
int age;
String address;


public Student(int rollno, String name, int age, String address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
	this.address = address;
}

@Override
public int compareTo(Student arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", address=" + address + "]";
}


}
