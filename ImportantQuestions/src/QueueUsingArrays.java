
class Queue {
	int n = 5, size = 0, front = 0, rear = 0;
	int arr[] = new int[n];

	public boolean isEmpty() {
		return (size == 0 || front == rear);//means when front and rear is 0=>it will happen only once initially
	}

	public boolean isFull() {
		return (size == n);
	}

	public void push(int x) throws Exception { //O(1)
		if (isFull()) {
			throw new Exception("Queue is Full");
		}
		arr[rear % n] = x;
		rear++;
		size++;
	}

	public void pop() throws Exception { //O(1)
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		arr[front % n] = -1;
		front++;
		size--;
	}

	public int top() throws Exception { //O(1)
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return arr[front % n];

	}

	public void printQueue() throws Exception { //O(size)
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		for (int i = front; i < rear; i++) {
			System.out.print(arr[i % n] + " ");
		}
	}
}

public class QueueUsingArrays {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.push(9);
		q.push(10);
		System.out.println(q.top());
		q.printQueue();
		q.push(11);
		q.push(3);
		q.push(8);
		System.out.println();
		q.printQueue();
		q.pop();
		System.out.println();
		System.out.println(q.top());
		q.push(6);
		System.out.println();
		q.printQueue();
		q.pop();
		q.pop();
		System.out.println();
		q.printQueue();
		q.push(7);
		System.out.println();
		q.printQueue();
		
	}

}
