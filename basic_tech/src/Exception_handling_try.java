
public class Exception_handling_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String a=null;
			System.out.println(a.length());
			System.out.println("1st:rest is executed");

		}
		catch(Exception e) {
			System.out.println(e);
//			System.out.println("String A is null");
		}
		finally {
			System.out.println(":");
		}
		System.out.println("2nd:rest is executed");

	}

}
