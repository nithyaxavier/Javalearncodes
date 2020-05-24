package collections;
import java.util.Iterator;
//Linkedhasset maintain insertion order and not allow duplicates.
//not allow null value thorws null pointer exception
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkhasset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Float> ls = new LinkedHashSet<Float>();
ls.add((float) 5.3);
ls.add((float) 0.5);
ls.add((float) 5.5);
ls.add((float) 5.6);
ls.add(null);
ls.add((float) 5.3);
ls.add(null);
//System.out.println(ls.size());
Iterator<Float> i = ls.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
TreeSet<String> ts = new TreeSet<String>();
ts.add("gvege");
//ts.add(null);
ts.add("anutton");
ts.add("anmhyt");
ts.add("ball");
ts.add("anmhyt");
System.out.println(ts);
for(String s :ts) {
	System.out.println(s);
}
	}

}
