import java.util.*;
public class Collections_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new LinkedList<String>();
		Scanner collect=new Scanner(System.in);
		System.out.println("enter how many name to be inserted : ");
		int a=collect.nextInt();
		
		for(int i=0;i<+a;i++) {
			
			String b=collect.next();
			name.add(b);
		}
		Collections.sort(name);
		for(String s:name) {
			System.out.println(s);
		}

	}

} 
