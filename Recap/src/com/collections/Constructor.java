package com.collections;

public class Constructor 
{
	 static int id=25;
	String name="KarthigaKrishnamoorthy";
	static double salary;
	public Constructor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		Constructor con=new Constructor(1,"Priyaoooooooo");
		con.display();
		Constructor k=new Constructor(2,"Ganeshh");
		k.display();
		salary =1000;
		id=550;
		Example e=new Example();
		e.run();
		System.out.println(salary+" "+id);

	}

}
class Example
{
	private static int i=10;
	
	
	 static void run()
	{
		System.out.println("Okay "+i);
	}
}