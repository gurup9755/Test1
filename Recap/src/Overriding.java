
public class Overriding
{
	float getRateOfInterest()
	{
		return 0;
	}  
}  
class SBI extends Overriding
{  
	float getRateOfInterest()
	{
		return 8.4f;
	}  
}  
class ICICI extends Overriding
{  
	float getRateOfInterest()
	{
		return 7.5f;
		
	}  
}  
class AXIS extends Overriding
{  
	float getRateOfInterest()
	{
		return 9.7f;
	}  
}  
class TestPolymorphism
{  
	public static void main(String args[])
	{  
		Overriding b=new Overriding();  
	b=new SBI();  
	System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
	b=new ICICI();  
	System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
	b=new AXIS();  
	System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
	}  
}
