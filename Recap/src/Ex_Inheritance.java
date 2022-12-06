
public class Ex_Inheritance {

	public static void main(String[] args)
	{
		Flower f=new Flower();
		f.flowerMethod();
		System.out.println(f.a);
		f.leafMethod();
		int kk=10;
		System.out.println(kk);
		System.out.println(f.b);
		f.stempMethod();
		f.treeMethod();
	}

}
class Tree
{
	public int kk;
	public int ll;
//	public Tree(int k,int l)
//	{
//		this.kk=k;
//		this.ll=l;
//	}
	public int a=10;
	public void treeMethod()
	{
		System.out.println("It's Tree Class");
	}
}
class Stemp extends Tree
{
//	public Stemp(int k, int l) {
//		super(k, l);
//		
//	}
	public String b="Hello Abi";
	public void stempMethod()
	{
		System.out.println("Its Stemp Class");
	}
}
class Leaf extends Stemp
{

	public void leafMethod()
	{
		System.out.println("It's Leaf Class");
	}
}
class Flower extends Leaf
{

	public void flowerMethod()
	{
		System.out.println("It's Flower Class");
	}
}