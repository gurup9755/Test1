package com.collections;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Karthiga");
		set.add("VeniKrish");
		set.add("Lakshmanan");
		System.out.println(set);
		System.out.println(set.parallelStream());
		
	}

}
