class bikee{
	bikee(){
		System.out.println("change to next gear");
	}
}
class cars extends bikee{
	cars(){
		
		System.out.println("Running at 100kmph");
		
	}
	cars(int speed){
		super();
		System.out.println("car is running at "+speed);
		
	}
	
}

public class constructor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars obj=new cars(100);
		cars obj1=new cars();
		

	}

}
