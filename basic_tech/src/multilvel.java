
public class multilvel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat obj=new cat();
		obj.eat();
		obj.bark();
		obj.meow();

	}

}
class animal{
	void eat () {System.out.println("eating");}
}
class dog extends animal{
	void bark() {System.out.println("barking");}
	
}
class cat extends dog{
	void meow() {System.out.println("meowing");}
}