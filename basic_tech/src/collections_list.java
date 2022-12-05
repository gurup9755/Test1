import java.util.*;
public class collections_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(9);
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(1);
		
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for(int i : list) {
			System.out.print(i+" ");
		}

	}

}
