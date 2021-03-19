package com.training.testexecution;

public class Student {
int roll_no;
String name;
float percentage;
String grade;


public Student(int rn ,String nm , float p) {
	this.roll_no=rn;
	name=nm;
	percentage=p;
}
public String grade() {
	
	if(percentage<35) {
		grade="Fail";
	}
	else if(percentage<50) {
		grade="Pass Class";
	}
	else if(percentage<60) {
		grade="Second Class";
	}
		else if(percentage<70) {
			grade="First Class";
		}
		else {
			grade="Distinction";
		}
	return grade;
}

public void display() {
	System.out.println("Roll No :"+roll_no);
	System.out.println("Name:"+name);
	System.out.println("Percentage :"+percentage);
	System.out.println("Grade :"+grade);
}
	
}

