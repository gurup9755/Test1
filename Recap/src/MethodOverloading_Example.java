import java.util.*;
public class MethodOverloading_Example
{

	public static void main(String[] args) 
	{
		ChildTwo t=new ChildTwo();
		t.unique(1000, 4784);
	}

}
class ParentClass
{
	int i=10;
	public void unique()
	{
		System.out.println("Hello "+i);
	}
}
class ChildOne extends ParentClass
{
	int j=20;
	public void unique(int j)
	{
		System.out.println("Hello "+j);
	}
}
class ChildTwo extends ChildOne
{
	int k=30;
	public void unique(int j,int k)
	{
		System.out.println("Hello "+k);
	}
}