package com.jdbc.concept;
import java.lang.*;
public class ForNameClass
{

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class.forName("Sample").newInstance();
	}

}
class Sample
{
	static
	{
		System.out.println("It's a static");
	}
	
	{
		System.out.println("It's a instanace method!");
	}
}