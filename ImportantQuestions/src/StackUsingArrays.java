class Stack {
	int top = -1;
	int arr[] = new int[5];

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

	public void push(int x) throws Exception {
		if (isFull()) {
			throw new Exception("Stack Overflow Exception");
		}
		arr[++top] = x;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack Underflow Exception");
		}
		int x = arr[top];
		top--;
		return x;
	}

	public int top() {
		return arr[top];
	}
	
	public int size() {
		return top+1;
	}
}

public class StackUsingArrays {

	public static void main(String[] args) throws Exception {
		Stack s = new Stack();
		s.push(18);
		s.push(90);
		s.push(5);
		System.out.println(s.top());
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.size());
	}

}
