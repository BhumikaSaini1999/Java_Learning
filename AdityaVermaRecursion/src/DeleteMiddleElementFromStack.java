import java.util.Stack;

//Time->O(n)
//Space->O(n)
public class DeleteMiddleElementFromStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(5);
		stack.push(3);
		stack.push(8);
		stack.push(2);
		stack.push(6);
		System.out.println("Before Deletion"+ stack);
		solve(stack, stack.size()/2+1);
		System.out.println("After Deletion"+ stack);
	}

	private static void solve(Stack<Integer> stack, int k) {
		// TODO Auto-generated method stub
		if(k==1) {
			stack.pop();
			return;
		}
		
		int temp = stack.pop();
		solve(stack, k-1);
		stack.push(temp);
	}

}
