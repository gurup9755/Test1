import java.util.*;
public class MethodOverriding 
{

	public static void main(String[] args)
	{
		Common c=new Common();
		c.load(5);

	}

}
class Common
{
	int i=350;
	public void load(int i)
	{
		System.out.println("Hello solartians! "+i);
	}
}
class CommonOne extends Common
{
	int i=989;
	public void load(int i)
	{
		System.out.println(i);
	}
	
}
