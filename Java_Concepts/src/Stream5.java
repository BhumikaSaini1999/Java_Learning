import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream5 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Bhumika");
		map.put(5, "Nitin");
		map.put(3, "Sourav");
		map.put(4, "Neeraj");
		map.put(8, "Monika");
		
		//Map<Integer, String> mapAns = map.entrySet().stream().sorted((a,b)->Integer.compare(a.getKey(), b.getKey()))
				//.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
		
		//mapAns.entrySet().stream().forEach(m->System.out.println(m.getKey()+"->"+m.getValue()));
		
		map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue())).
		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1,a2)->a1, LinkedHashMap::new)).
		entrySet().forEach(x->System.out.println(x.getKey()+"->"+x.getValue()));
	}

}
