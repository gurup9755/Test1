
public class HybridInheritance {

	public static void main(String[] args)
	{
		Bill b=new Bill();
		b.productssDetails();
		b.financeDetails();
		Shop s=new Shop();
		s.shopsDetails();
	}

}
class Shop
{
	public void shopsDetails()
	{
		System.out.println("All shops here!");
	}
}
interface Products
{
	public void productssDetails();

}
interface Finance
{
	public void financeDetails();

}
class Bill implements Products,Finance
{

	@Override
	public void financeDetails() {
		System.out.println("Pls find out finance details here!");
	}

	@Override
	public void productssDetails() {
		System.out.println("Products details here!!!!!!!!!!!!");
	}
	
}