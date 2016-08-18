package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ArrayList<Object> names= new ArrayList<Object>();
		names.add("Abdul");
		names.add("Imran");
		names.add("Khan");
		names.add("Faheem");
		names.add("Shahroz");


		System.out.print(names+" ");
		System.out.println();
		names.remove("Abdul");
		System.out.println("post removing");
		System.out.print(names+" ");
		System.out.println();
		names.add("Abdul");
		Iterator<Object>
				list =names.listIterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		for(Iterator LN = names.iterator(); LN.hasNext();){
			System.out.print(LN.next()+" ");
		}

	}

}




