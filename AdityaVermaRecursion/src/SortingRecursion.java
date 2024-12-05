import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time->O(n^2)
//Space->O(n) {Recursive Stack Space}
public class SortingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Integer arr[] = {2, 8, 1, 5, 3, 7};
       List<Integer> list = new ArrayList<>(Arrays.asList(arr));
       
       sort(list);
       System.out.println(list);
	}

	private static void sort(List<Integer> list) {
		try {

			if(list.size()==1) {
				return;
			}
			
			int temp = list.get(list.size()-1);
			list.remove(list.size()-1);
			sort(list);
			insert(list, temp);
		
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void insert(List<Integer> list, int temp) {
		if(list.size()==0 || list.get(list.size()-1)<=temp) {
			list.add(temp);
			return;
		}
		
		int val = list.get(list.size()-1);
		list.remove(list.size()-1);
		insert(list, temp);
		list.add(val);
	}

}
