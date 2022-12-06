package com.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<>();
		//ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(78);
		al.add("Karthiga");
		al.add("Sowmi");
		al.add('F');
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.add("Hello"));
		System.out.println(al);
		System.out.println(al.size());
		al.add(4,"Veni");
		System.out.println(al);

		System.out.println(al.contains(10));
		System.out.println(al.get(3 ));
		System.out.println(al.remove(2));
		System.out.println(al);
		al.set(5, 'K');
		
		System.out.println(al.indexOf(20));
		ArrayList al2=new ArrayList<>();
		
		al2.addAll(al2);
		System.out.println(al2);
		ArrayList al3=new ArrayList<>();
		al3.add("Chennai");
		al3.add("Bengaluru");
		al3.add("Mumbai");
		al3.add("New Delhi");
		al3.add("Kolkata");
		al3.add("Chennai");
		System.out.println("Index of chennai: "+al3.indexOf("Chennai"));
		System.out.println("Last Index of chennai: "+al3.lastIndexOf("Chennai"));
		System.out.println("List 3: "+al3);
		
		List al4= al3.subList(1,3);
		System.out.println(al4);
		al4.addAll(2,al3);
		al4.add(0, "NO");
		System.out.println(al4);
		//System.out.println(al4.p);
	}

}
