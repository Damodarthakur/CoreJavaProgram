package collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		System.out.println(l);
		l.set(0, "software");
		l.add(0,"venky");
		l.removeLast();
		l.addFirst("damodar");
		System.out.println(l);
	}

}
