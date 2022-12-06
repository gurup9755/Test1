package com.collections;
import java.util.*;
public class ListOFHashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> mapOne=new HashMap();
		mapOne.put(1,"Abirami");
		mapOne.put(2,"Akash");
		mapOne.put(3,"Guru");
		HashMap<Integer,String> mapTwo=new HashMap();
		mapTwo.put(1,"Abirami");
		mapTwo.put(2,"Akash");
		mapTwo.put(3,"Guru");
		HashMap<Integer,String> mapThree=new HashMap();
		mapThree.put(10, "Kaviya");
		mapThree.put(20, "Hello");
		HashMap<Integer,Float> mapFour=new HashMap();
		mapFour.put(21,45.5f);
		mapFour.put(22,55.6f);
		mapFour.put(23,65.7f);
		HashMap<Integer,String> mapFive=new HashMap();
		mapFive.put(101, "KARTHIGA");
		mapFive.put(101, "Krish");
		mapFive.put(101, "Lax");
		mapFive.put(101, "Karthikeyarajan");
		List<Object> l=new ArrayList<>();
		l.add(mapOne);
		l.add(mapTwo);
		l.add(mapThree);
		l.add(mapFour);
		l.add(mapFive);
		System.out.println(l);

	}

}
