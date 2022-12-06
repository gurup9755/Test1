package com.collections;

public class TestThisClass 
{
	public int no;
	public String name;
	public float fee;
	TestThisClass(int no,String name,float fee)
	{
		this.no=no;
		this.name=name;
		this.fee=fee;
	}
public void displayDetails()
{
	System.out.println(no+" "+name+" "+fee);
}
}
class Testing
{
	public static void main(String[] args) 
	{
		TestThisClass t=new TestThisClass(1,"Krishnaveni",6500);
		t.displayDetails();
	}
}