package com.demo.hello;

import java.util.PriorityQueue;
import java.util.Queue;

public class quuu {

	public static void main(String[] args) {
		quuu ww=new quuu();
		Queue aa=ww.create();
		ww.display(aa);

	}
	
	public Queue create()
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(100);
		q.add(200);
		q.add(50);
		return q;
	}
	public void display(Queue q) {
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
	}

}
