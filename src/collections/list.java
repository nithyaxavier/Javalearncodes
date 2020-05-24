package collections;
//can have duplicates and null values
//maintain order-insertion/sequential order
//store value in index based
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class list {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al = new ArrayList<String>();
al.add("h");
al.add("hello");//
al.add( "hai");//adding element in particular index.
al.add("h");
al.add(null);
al.add(null);
al.add("simple");
System.out.println(al.size());
//how to iterate arraylist.
//for (String a : al)//advanced for loop- for(Datatype varname = obj name/array/collection)
 //{
	//System.out.println(a);
	//}
/*below code is for iterating the Array using iterator*/
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(7);
a.add(8);
	a.add(1);
a.add(40);
a.add(5);
a.add(null);
ListIterator<Integer>  af =  a.listIterator();//here we can use both iterator and listiterator
while (af.hasNext()){
	int s = af.next();
	System.out.println(s);
}


	}
}
