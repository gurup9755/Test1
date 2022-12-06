
public class MultipleInheritance
{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.runOne();
		c.runTwo();
		c.runThree();
	}
}
interface One
{
	public void runOne();
	
}
interface Two
{
	public void runTwo();
	
}
interface Three extends One,Two
{
	public void runThree();
}
class Child implements Three
{

	@Override
	public void runOne() {
		System.out.println("Method one");		
	}

	@Override
	public void runTwo() {
		System.out.println("Method two");		
		
	}
	
	@Override
	public void runThree() {
		System.out.println("Method three");		
		
	}
	
}