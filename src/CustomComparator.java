import java.util.Comparator;

public class CustomComparator implements Comparator<Tuple>{

	@Override
	public int compare(Tuple o1, Tuple o2) {

		
		Integer value1 = (Integer)o1.getValue();
		Integer value2 = (Integer)o2.getValue();

		
		return Integer.compare(value1 , value2);
		
	}

	
}
