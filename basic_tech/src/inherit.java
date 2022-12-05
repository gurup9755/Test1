class employee{
	int salary=12000;
	void run() {
		System.out.println("print");
	}
}
public class inherit extends employee {
	int salary=50000;
	void run() {
		super.run();
		System.out.println("printing");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit obj=new inherit();
		System.out.println(obj.salary);
		obj.run();

	}

}
