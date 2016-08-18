package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Object> pen = new LinkedList<>();
		pen.add( "Abdul pen" );
		pen.add( "Imran's pen" );
		pen.add( "Khan's pen" );
		pen.add( "Faheem's pen" );
		pen.add( "shahroz's pen" );

		System.out.println( pen.peek() );
		System.out.println( pen );



		Iterator<Object> list = pen.iterator();
		while (list.hasNext()) {
			System.out.print( list.next() + " " );
		}

		for (Iterator pens = pen.iterator(); pens.hasNext(); ) {

			System.out.print( pens.next() + " " );
		}

	}
}
