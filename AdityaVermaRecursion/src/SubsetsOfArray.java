import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
	
        static List<List<Integer>> finalSubsets = new ArrayList<>();
	
	    public static void main(String[] args) {
	    	int[] nums = {1, 2};
	    	System.out.println(subsetsOfArray(nums));
	    }

	    public static List<List<Integer>> subsetsOfArray(int[] nums) {
	        List<Integer> subset = new ArrayList<>();

	        int start=0, end=nums.length-1;
	        subsets(nums, start, end, subset, finalSubsets);
	        return finalSubsets;
	    }

	    public static void subsets(int[] nums, int start, int end, List<Integer> subset, List<List<Integer>> finalSubsets) {
	        if(start>end){
	            finalSubsets.add(subset);
	            return;
	        } 

	        subsets(nums, start+1, end, subset, finalSubsets);
	        subsets(nums, start+1, end, new ArrayList<>(nums[start]), finalSubsets);
	    }
	    

}
