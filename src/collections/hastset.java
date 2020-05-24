package collections;
//3 types - hash set, Linkedset, tree set
//set does not accept duplicate values, which means it allow but it will update the latest one
//no maaintain seq or instertion order.
import java.util.HashSet;
import java.util.Iterator;
public class hastset {
	public static void main(String[] args) {
HashSet<String> hs = new HashSet<String>();
hs.add("st");
hs.add("helo");
hs.add(null);
hs.add("st");
System.out.println(hs);
//System.out.println(hs.size());
Iterator<String> i = hs.iterator();//itertor interface
//here using while loop we have came into each set to get those values.Iterate through objs
while(i.hasNext()) {
	System.out.println(i.next());
}

	}

}




/*HashSet<Integer> hst = new HashSet<Integer>();
hst.add(9);
hst.add(9);
hst.add(null);
hst.add(10);
System.out.println(hst);*/
