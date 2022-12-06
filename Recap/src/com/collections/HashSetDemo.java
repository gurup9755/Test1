package com.collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
	public static void main(String[] args) 
	{
		HashSet<String> set=new HashSet<String>();  
		set.add("priya");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
//		while(itr.hasNext())
//		{  
//			System.out.println(itr.next());  
//		}  
		System.out.println(set);
	}

}
