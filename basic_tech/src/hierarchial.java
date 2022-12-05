
public class hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		milege obj=new milege();
		obj.mileges();
		obj.ride();
		model obj1=new model();
		obj1.models();

	}

}
class bike {
	void ride() {
		System.out.println("riding");
	}
}
class model extends bike{
	void models() {
		System.out.println("3 model");
	}
}
class milege extends bike{
	void mileges() {
		System.out.println("mileges");
	}
}