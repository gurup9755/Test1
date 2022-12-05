import java.util.*;

public class set_ {

	public static void main(String[] args) {
		HashSet<Integer> set= new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
