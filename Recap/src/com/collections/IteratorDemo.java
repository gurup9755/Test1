package com.collections;
import java.util.*;
public class IteratorDemo {

	public static void main(String[] args)
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("Snacks");
		l.add("Groceries");
		l.add("Dresses");
		l.add("Metal items");
		Iterator t=l.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
	}

}
