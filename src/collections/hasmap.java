package collections;
//hashmap store value in form of Key ,value. Not allow duplicate Key.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hm =new HashMap<Integer, String>();
hm.put(4, "Hello");
hm.put(1, "simple");
hm.put(0, "hai");
hm.put(7, "hyt");
hm.put(0, "ty");
hm.put(8, "hyt");
Set st = hm.entrySet();
Iterator s = st.iterator();
while(s.hasNext()) {
	Map.Entry me = (Map.Entry)s.next();
	System.out.println("Key is :" + me.getKey() +"& " +"Value is:" + me.getValue());
}

	}

}
