package com.collections;

import java.util.LinkedList;

public class DemolinkedList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(8);
		ll.add(7);
		ll.add('E');
		ll.add("Karthiga");
		ll.add(false);
		ll.add(104.98);
		System.out.println(ll);
		ll.addFirst("Divya");;
		System.out.println(ll.isEmpty());
		LinkedList ll2=new LinkedList();
		System.out.println(ll2.addAll(0, ll));
		System.out.println(ll2.containsAll(ll));
		System.out.println(ll2);
		ll2.add(86.3f);
		ll2.addLast("Bye");
		ll2.add(3, "Yes");  // add elements using index
		
		System.out.println("Before poll "+ll2);
		System.out.println(ll2.poll());
		System.out.println("After poll "+ll2);
		System.out.println(ll2.pollLast());
		System.out.println("Final Linked List: "+ll2);
		System.out.println(ll2.offer(500000000)); //offer also same as add method in ll
		System.out.println(ll2);
		System.out.println(ll2.offerFirst("First element jhififjgfj ijirjifj kjgjg")); //offer method is a boolean expression so it is returing ture
		System.out.println(ll2);
		
		System.out.println(ll2.peek()); //displaying peek element in the ll
		System.out.println(ll2.peekFirst());
		System.out.println(ll2.peekLast());
		LinkedList ll3=(LinkedList) ll2.clone(); //clone obj means it will give the copy of which ll we are specifying.
		System.out.println("Clone Object: "+ll3);
		ll3.clear();
		System.out.println(ll3);
	}

}
