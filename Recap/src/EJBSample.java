import java.io.Serializable;

public class EJBSample implements Serializable
{
	private String employeeName;
	private int EmplyeeID;
	private String EmployeeRole;
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public int getEmplyeeID()
	{
		return EmplyeeID;
	}
	public void setEmplyeeID(int emplyeeID)
	{
		EmplyeeID = emplyeeID;
	}
	public String getEmployeeRole()
	{
		return EmployeeRole;
	}
	public void setEmployeeRole(String employeeRole)
	{
		EmployeeRole = employeeRole;
	}

}
class MainEJB
{
	public static void main(String[] args) 
	{
		EJBSample e=new EJBSample();
		e.setEmployeeName("Veni");
		e.setEmplyeeID(2559);
		e.setEmployeeRole("Development");
		System.out.println(e.getEmployeeName());
		System.out.println(e.getEmplyeeID());
		System.out.println(e.getEmployeeRole());

	}
}