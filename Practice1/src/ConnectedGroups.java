import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConnectedGroups {

    public static void main(String[] args) {
        List<String> adj0 = Arrays.asList("110", "110", "001");
        List<String> adj1 = Arrays.asList("10000","01000","00100","00010","00001");
        List<String> adj2 = Arrays.asList("11100","11100","11100","00011","00011");
        List<String> adj3 = Arrays.asList("10100","01010","10100","01010","00001");
        List<String> adj4 = Arrays.asList("1100","0110","1110","0110","0001");
        List<String> adj5 = Arrays.asList("1100",
"1110",
"0110",
"0001");

//        for (List<String> related : Arrays.asList(adj0, adj1, adj2, adj3, adj4)) {
//            System.out.println(related);
//            System.out.println(count_connected_groups(related));
//        }
        
        for (List<String> related : Arrays.asList(adj5)) {
            System.out.println(related);
            System.out.println(count_connected_groups(related));
        }
    }

    private static int count_connected_groups(List<String> adj) {
        int count=0;
        int n = adj.size();
        Stack<Integer> nodesToCheck = new Stack<>();
        nodesToCheck.addAll(IntStream.range(0,n).boxed().collect(Collectors.toList()));
        System.out.println(nodesToCheck);
        System.out.println("Top: "+nodesToCheck.peek());

        while (!nodesToCheck.isEmpty()) {
            count++;
            Integer node = nodesToCheck.pop();
            String adjacent = adj.get(node);
            Set<Integer> otherGroupMembers = new HashSet<>();
            for (Integer i : nodesToCheck) {
                if (adjacent.charAt(i) == '1') otherGroupMembers.add(i);
            }
            nodesToCheck.removeAll(otherGroupMembers);
        }
        return count;
    	
//    	int groupCount=0;
//    	int size=related.size();
//    	List<Integer> nodesToCheck = new ArrayList<>();
//    	
//    	for(int i=size; i>=0; i--) {
//    		nodesToCheck.add(i);
//    	}
//    	
//    	int k = nodesToCheck.size()-1;
//    	while(!nodesToCheck.isEmpty()) {
//    		groupCount++;
//    		Integer node = nodesToCheck.get(k);
//    		
//    	}
//    
//    	return groupCount;
    }
}