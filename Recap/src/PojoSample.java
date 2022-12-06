
public class PojoSample 
{
	String name;
	public int age;
	private double salary;
	
	public PojoSample(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	public String getName() 
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}

	public double getSalary() 
	{
		return salary;
	}

	

}
class MainPojo
{
	public static void main(String[] args)
	{
		PojoSample p=new PojoSample("Karthiga",21,24000);
		p.name="Karthiga Krish";
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSalary());
	}
}
