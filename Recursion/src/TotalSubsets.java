import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalSubsets {
	
	private static List<List<Integer>> subsetsHelper(int[] nums, int i){
        if(i==-1){
        	List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<Integer>());
            return ans;
        }
        
        List<List<Integer>> partialAns = subsetsHelper(nums,i-1);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(List<Integer> subset : partialAns) {
        	List<Integer> newSubset = new ArrayList<>(subset);
        	newSubset.add(nums[i]);
        	ans.add(newSubset);
        }
        
        for(List<Integer> subset : partialAns) {
        	ans.add(new ArrayList<Integer>(subset));
        }
        
        return ans;
    }
	
	public static List<List<Integer>> subsets(int[] nums) {
        return subsetsHelper(nums, nums.length-1);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		List<List<Integer>> ans = subsets(arr);
		System.out.println(ans);
		sc.close();
	}

}
