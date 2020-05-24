package interviewbasecodes;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class distintary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 10, 5, 3, 4, 3, 5, 6 };
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i =0;i<ar.length;i++) {
			hm.put(ar[i], i);
		}
		System.out.println(hm.keySet());
		
	}
		

}
