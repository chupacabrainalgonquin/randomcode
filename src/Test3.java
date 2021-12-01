import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String argsp[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("hundred1", 101);
		map.put("abc", 1);
		map.put("pqr", 6);
		map.put("hundred", 100);
		map.put("312", 1200);
		map.put("fdsafa", 101);
		map.put("nmska", 3);
		map.put("fjadal", 99);

		map.entrySet().stream().map(mapper -> {

			Tuple t = new Tuple();
			t.setKey(mapper.getKey());
			t.setValue(mapper.getValue());
			return t;
		}).sorted(new CustomComparator()).forEach(f -> System.out.println(f.getValue()));

		// Natural order of list sorting
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

		List<String> str = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

		System.out.println(str);

	}

}
