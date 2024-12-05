import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Nitika");
		map.put(2, "Neeraj");
		map.put(3, "Bhumika");
		map.put(4, "Komal");
		map.put(5, "Anamika");
		
//		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
//		Collections.sort(list, (i1,i2)->i1.getValue().compareTo(i2.getValue()));
//		
//		Map<Integer,String> mapAns = new LinkedHashMap<>();
//		for(Map.Entry<Integer, String> entry : list) {
//			mapAns.put(entry.getKey(), entry.getValue());
//		}
//		
		//System.out.println(mapAns);
		
		HashMap<Integer,String> ansMap = map.entrySet().stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue())).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, 
				(e1,e2)->e1, LinkedHashMap :: new));
		System.out.println(ansMap);
	}

}
