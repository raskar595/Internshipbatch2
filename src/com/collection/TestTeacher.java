package com.collection;

import java.util.ArrayList;

public class TestTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud=new Student(11, "Abhay Sarwade", "Pune", 78);
		Student stud1=new Student(12, "Sambhaji Jadhav", "Katraj", 68);
		Student stud2=new Student(13, "Abhay Bankar", "Sangli", 97);
		Student stud3=new Student(14, "Akshay Sarwade", "Pune", 74);
		
		ArrayList<Student> studList=new ArrayList<Student>();
		studList.add(stud);
		studList.add(stud1);
		studList.add(stud2);
		studList.add(stud3);
		
		Teacher teach=new Teacher(101, "Suraj Raskar", "Java Trainer", 1800, studList);
		
//		System.out.println(teach);
		
		int sum=0;
		int avg=0;
		int count=0;
		
		for(Student rec:teach.getStudents()) {
			sum+=rec.getMarks();
			count++;
		}
		
		avg=sum/count;
		System.out.println(avg);
		
		for(Student data:teach.getStudents()) {
			if(data.getMarks()>=avg) {
				System.out.println(data.getName());
			}
		}

		
//		for(Student data:teach.getStudents()) {
//			if(data.getMarks()>=75) {
//				System.out.println(data.getName());
//			}
//		}

	}

}
