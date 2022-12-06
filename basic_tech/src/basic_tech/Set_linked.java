package basic_tech;
import java.util.*;
public class Set_linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> name=new LinkedHashSet<String>();
		name.add("hari");
		name.add("Guru");
		name.add("Ravi");
		name.add("abi");
		name.add("karthiga");
		System.out.println(name.contains("Harish"));
		System.out.println(name.size());
		
		System.out.println(name);

	}

}
