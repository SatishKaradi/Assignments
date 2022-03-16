package com.te.assignmentstudent.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainStudent  {
public static void main(String[] args) {
char temp='s';
System.out.println("press 1 to sort the students by their Rollono");
System.out.println("press 2 to sort the students by their Age");
System.out.println("press 3 to sort the students by their Names");
System.out.println("press 4 to sort the students by their marks");

	ArrayList<Student> arrayList= new ArrayList<Student>();
	arrayList.add(new Student(1000, "satish", 23, 75));
	arrayList.add(new Student(1001, "prajwal", 21, 99));
	arrayList.add(new Student(1002, "swaroop", 24, 98));
	arrayList.add(new Student(1003,"tanushree", 25, 95));
	arrayList.add(new Student(1004, "roopa", 26, 100));
	

	Scanner scanner=new Scanner(System.in);
	do {
	System.out.println("Enter the choice :");
	int choice=scanner.nextInt();
	
	switch (choice) {
	case 1:
		
		System.out.println("Sorting by rollno");
		Collections.sort(arrayList,new CompareByRollNo());
		for (Student student : arrayList) {
			System.out.println(student);
			
		}
	break;
	case 2:
		System.out.println("Sorting by age");
		Collections.sort(arrayList,new CompareByAge());
		for (Student student : arrayList) {
			System.out.println(student);
			
		}
		break;
	case 3:
		System.out.println("Sorting by name");
		Collections.sort(arrayList,new CompareByName());
		for (Student student : arrayList) {
			System.out.println(student);		
		}
		break;
	case 4:
		System.out.println("Sorting by marks");
		Collections.sort(arrayList,new CompareByMarks());
		for (Student student : arrayList) {
			System.out.println(student);			
		}
		break;
	default :
		System.out.println("ohh please enter ");		
	}
	System.out.println("D0 you want to continue..");
	char str=scanner.next().charAt(0);
	temp=str;
    }while(temp=='y');
	
	}
}

