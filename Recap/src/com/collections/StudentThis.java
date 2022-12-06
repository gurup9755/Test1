package com.collections;

public class StudentThis 
{
	int rollno;  
	String name;  
	float fee;  
	StudentThis(int rollno,String name,float fee)
	{  
	rollno=rollno;  
	name=name;  
	fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
	class TestThis
	{  
		
	public static void main(String args[])
	{  
		StudentThis s1=new StudentThis(111,"ankit",5000f);  
		StudentThis s2=new StudentThis(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}
}
