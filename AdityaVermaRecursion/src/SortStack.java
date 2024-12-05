import java.util.Stack;

//Time Complexity->O(n^2)-> In the worst scenario if all the elements of the stack are in descending order 
//then to insert the temp element of stack to its correct position, we have to pop out all the elements from the stack 
//push temp into stack and then push all the popped elements into stack.
//Space Complexity->O(n) {Recursive Stack Space}
public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(5);
		stack.push(3);
		stack.push(8);
		stack.push(2);
		stack.push(6);
		System.out.println("Before Sorting"+ stack);
		sort(stack);
		System.out.println("After Sorting"+ stack);
	}

	 //Ascending Order
	private static void sort(Stack<Integer> s) {
		// TODO Auto-generated method stub
		if(s.size()==1) {
			return;
		}
		int temp = s.pop();
		sort(s);
		insert(s, temp);
	}

	private static void insert(Stack<Integer> s, int temp) {
		// TODO Auto-generated method stub
		if(s.size()==0 || s.peek()<=temp) {
			s.push(temp);
			return;
		}
		int val = s.pop();
		insert(s, temp);
		s.push(val);
	}

}
