import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Listofmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<>();
		map.put("one","Cycles");
		map.put("two","bikes");
		map.put("Three","autos");
		map.put("Four","Cars");
		
		HashMap<String,String> map1=new HashMap<>();
		map1.put("one","Cycles");
		map1.put("two","bikes");
		map1.put("Three","autos");
		map1.put("Four","Cars");
		
		List<Object> list=new ArrayList<>();
		list.add(map);
		list.add(map1);
		
		System.out.println(list);
		

	}

}
