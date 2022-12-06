package com.collections;

//public class A
//{  
//	void m()
//	{
//		System.out.println("hello m");
//	}  
//	void n()
//	{  
//		System.out.println("hello n");  
//		this.m();  
//	}  
//}  
//class TestClass
//{  
//public static void main(String args[])
//{  
//	A a=new A();  
//	a.n();  
//}
//}  
class Hello
{  
	Hello()
	{  
		this(5);  
		System.out.println("hello a");  
	}  
	Hello(int x)
	{  
		System.out.println(x);  
	}  
}  
class TestClass
{  
	public static void main(String args[])
	{  
		Hello a=new Hello();  
	}
}  