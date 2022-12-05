import java.util.*;
public class collections_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(554545);
		
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for(int i : list) {
			System.out.print(i+" ");
		}

	}

}
