package com.collections;

public class SampleConstructor
{
	public static void main(String args[])
    {  
   
    Student5 s2 = new Student5(222,"Aryan",25);  
    Student5 s3=new Student5(333,"Okay",40);
   
    s2.display();  
    s3.display();
   }  
}
class Student5{  
    public int id;  
    String name;  
    int age;  
    
    Student5(int i,String n,int a)
    {  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display()
    {
    	System.out.println(id+" "+name+" "+age);
    }  
   
    
}  