package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<Object> pic=new Stack<>();
		pic.push("Abdul's pic");
		pic.push("Imran's pic");
		pic.push("Khan's pic");
		pic.add("Faheem's pic");
		pic.add("Shahroz's pic");


		System.out.println(pic.peek());
		System.out.println(pic);
		System.out.println(pic.pop());
		System.out.println(pic);
		System.out.println(pic.peek());
		System.out.println(pic);
		pic.remove("Khan's pic");
		System.out.println(pic);
		pic.push("Khan's pic");
		System.out.println(pic);

		Iterator<Object> list=pic.iterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("for loop with an iterator");
		for(Iterator pic1=pic.iterator();pic1.hasNext();){
			System.out.print(pic1.next()+" ");
		}



	}

}
