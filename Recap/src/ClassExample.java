import java.util.*;
public class ClassExample {

	public static void main(String[] args) 
	{
		Box blackBox=new Box();
		blackBox.pink=10;
		Box obj=new Box();
		obj.black=20;
		System.out.println(blackBox.pink);
		System.out.println(obj.black);
	}

}
class Box
{
	int white;
	int black;
	int pink;
}