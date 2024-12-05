package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer> q = new LinkedList<>();
//		q.offer(1);
//		q.offer(2);
//		
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.peek());
//		System.out.println(q.isEmpty());
//		
//		Stack<Integer> stack = new Stack<>();
//		stack.push(1);
//		stack.push(2);
//		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.peek());
//			stack.pop();
//		}
		
		//ArrayDeque
		//Double ended queues
		Deque<Integer> dq = new ArrayDeque<>();
		dq.offerFirst(1);
		dq.offerFirst(2);
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq.peekFirst());
	}

}
