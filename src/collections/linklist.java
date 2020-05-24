package collections;
//below is for Linkedlist same as array
//can have duplicates and null values
//maintain order-insertion/sequential order
//store value in 3 segment, prev ref-curr val-next ref
import java.util.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;
public class linklist {
public static void main(String[] args) {
		LinkedList<Integer> ll  = new LinkedList<Integer>();
		ll.add(7);
		ll.add(8);
			ll.add(1);
		ll.add(40);
		ll.add(5);
		//ll.add(null);
		ll.add(1);
		ll.addFirst(4);
		
		Iterator<Integer>  ll1 =  ll.iterator();//here we can use both iterator and listiterator
		while (ll1.hasNext()){
			int  s = ll1.next();
			System.out.println(s);
		}


			}
		
	}

