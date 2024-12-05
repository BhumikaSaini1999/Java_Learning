import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kMostRecentRequests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		String[] requests = new String[n];
		//System.out.println("Enter requests: ");
		for(int i=0; i<requests.length; i++) {
			requests[i]=sc.next();
		}
		
		//System.out.println("Enter k: ");
		int k = sc.nextInt();
		
		
		List<String> res= new ArrayList<>();
		int i=n-1, count=0;
		while(i>=0 && count!=k){
			if(!res.contains(requests[i])) {
				res.add(requests[i]);
				count++;
			}
			i--;
		}
		
		for(String x : res)
			System.out.print(x+" ");
	}

}
