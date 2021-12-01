import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test1 {

	
	public static void main(String argsp[]) {
		
		PriorityQueue<Tuple> pqueue = new PriorityQueue<Tuple>(new CustomComparator());
		Map<String , Integer> map = new HashMap<String , Integer>();
		
		map.put("hundred1" , 101);

		map.put("abc" , 1);
		map.put("pqr" , 6);
		map.put("hundred" , 100);
		map.put("312" , 1200);
		map.put("fdsafa" , 101);

		map.put("nmska" , 3);
		map.put("fjadal" , 99);
		
		for (Map.Entry<String, Integer> entryset : map.entrySet()) {
			Tuple<String, Integer> tuple = new Tuple<String, Integer>();
			tuple.setKey(entryset.getKey());
			tuple.setValue(entryset.getValue());
			pqueue.add(tuple);

		}
		pqueue.forEach(s -> System.out.println(s.getValue()));
		
		
	}
	
	
	
	
	

}
