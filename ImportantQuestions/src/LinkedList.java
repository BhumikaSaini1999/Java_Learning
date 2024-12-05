import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class LinkedList {

	static Node head = null, prev = null;

	public static void main(String[] args) {
		insert(0);
		insert(1);
		insert(2);
		insert(3);
		traverse(head);
	}

	private static void delete(int index) {
		if (index == 1) {// O(1) for deleting from ist index
			head = head.next;
			return;
		}

		Node temp = head; // In worst case, O(n) for last index
		int i = 1, steps = index - 1;
		while (i < steps) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	private static void traverse(Node head) {// O(n)
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	private static void insert(int data) {// O(1) here as we are inserting nodes on demand and maintaing prev every time
		if (head == null) {
			head = new Node(data);
			prev = head;
		} else {
			Node newNode = new Node(data);
			prev.next = newNode;
			prev = newNode;
		}
	}
}
