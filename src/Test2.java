import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class Test2 {

	
	public static void main(String argsp[]) {

	Map<String , Integer> map = new HashMap<String , Integer>();
	
	map.put("hundred1" , 101);
	map.put("abc" , 1);
	map.put("pqr" , 6);
	map.put("hundred" , 100);
	map.put("312" , 1200);
	map.put("fdsafa" , 101);
	map.put("nmska" , 3);
	map.put("fjadal" , 99);
	
	
	ConcurrentSkipListMap<Integer, String> list = new ConcurrentSkipListMap<Integer, String>();
		
	map.entrySet().stream().forEach(s->{
		Integer key = s.getValue();
		String value = s.getKey();
		list.put(key, value);
	});
	
	
	list.entrySet().stream().forEach( s->System.out.println(s.getKey()));

	}
}
