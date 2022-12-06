package com.collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class HashMapExample {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h=new HashMap();
		h.put(1, "Punitha");
		h.put(2, "Hello");
		h.put(3, "Abirami");
		h.put(4, "Akash");
		h.put(4, "Pradeep");
		h.put(6, "Akash");
		h.remove(6);
		h.replace(4, "Pranav");
		for(Map.Entry obj:h.entrySet())
		{
			//System.out.println(obj.getKey()+ ", "+obj.getValue());
			System.out.print("key: "+ obj.getKey() + " & Value: ");
		      System.out.print(obj.getValue());
		      System.out.println();
		}
		

	}

}
