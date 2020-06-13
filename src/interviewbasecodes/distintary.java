package interviewbasecodes;
import java.util.ArrayList;
import java.util.Arrays;
//remove duplicate entry in the array using HashMap coolection
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class distintary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 10, 5, 3, 4, 3, 5, 6 };
				int[] in = { 10, 5, 3, 4, 3, 5, 6 };
				List<Integer>  l1 = new ArrayList (Arrays.asList(in));
				System.out.println(l1); 
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i =0;i<ar.length;i++) {
			hm.put(ar[i], i);
		}
		//System.out.println(hm.keySet());
		
		String[] ar1 = {"hai","hary","sop"};
		//System.out.println(ar1[0]);
		List l = new ArrayList(Arrays.asList(ar1));
		
		System.out.println(l);
	}
		

}
