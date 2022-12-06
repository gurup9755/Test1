
public class AnotherMultipleInherit {

	public static void main(String[] args)
	{
//		X obj=new Y();
//		System.out.println(obj.i);
//		C obj=new C();
//		System.out.println(obj.s);
//		System.out.println(obj.s);
//		System.out.println(obj.s);
//		B obj1=new B();
//		System.out.println(obj1.s);
//		System.out.println(obj1.s2);
		Y obj=new Y(10,20,"Hello Eclipse user!");
	}

}
//class X
//{
//	int i=123;
//	public void run()
//	{
//		System.out.println("It is a parent class");
//	}
//	
//}
//class Y extends X
//{
//	int i=456;
//	public void display()
//	{
//		System.out.println("It is a Child class");
//	}
//}
// class A
//{
//	String s="Class A";
//}
//class B extends A
//{
//	String s="Class B";
//	String s2="Class B only";
//}
//class C extends B
//{
//	String s="Class C";
//}
class X
{
	public X()
	{
		System.out.println(1);
	}
}
class Y extends X
{
	public Y(int a,int b,String s)
	{
		System.out.println(2);
	}
}