package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

import static com.sun.imageio.plugins.jpeg.JPEG.names;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> customers = new LinkedList<String>();


		customers.add("Khan");
		customers.add("Imran");
		customers.add("Abdul");
		customers.add("Shahroz");
		customers.add("Faheem");
		System.out.print(customers + " ");

		customers.remove("Imran");
		System.out.print(customers + " ");
		System.out.print(customers.peek() + " ");
		System.out.print(customers.peekFirst() + " ");
		System.out.print(customers.peekLast() + " ");
		Iterator<String> list = customers.listIterator();
		System.out.println();
		while (list.hasNext()) {
			System.out.print(list.next() + " ");
		}
		System.out.println();
		for (Iterator list2 = customers.iterator(); list2.hasNext(); ) {
			System.out.print(list2.next() + " ");
		}

	}


	}




