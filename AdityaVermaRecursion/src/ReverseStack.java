import java.util.Stack;

//Time Complexity->O(n^2)-> To push a top element to the bottom of the stack, we are popping out 
//all the element from the stack and pushing the top element into bottom and then again pushing all
//the popped out elements into stack.This we are doing for each element of the stack.
//Space Complexity->O(n) {Recursive Stack Space}
public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(5);
		stack.push(3);
		stack.push(8);
		stack.push(2);
		stack.push(6);
		System.out.println("Before Reverse"+ stack);
		reverse(stack);
		System.out.println("After Reverse"+ stack);

	}

	private static void reverse(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		if(stack.size()==1) {
			return;
		}
		int temp = stack.pop();
		reverse(stack);
		insert(stack, temp);
	}

	private static void insert(Stack<Integer> stack, int temp) {
		// TODO Auto-generated method stub
		if(stack.size()==0) {
			stack.push(temp);
			return;
		}
		int val= stack.pop();
		insert(stack, temp);
		stack.push(val);
	}

}
