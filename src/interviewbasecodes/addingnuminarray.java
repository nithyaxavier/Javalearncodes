package interviewbasecodes;

public class addingnuminarray {

	public static void main(String[] args) {
	int[] a = {1,2,3,4,5};
	
	int sum = 0;
	/*for(int i=0;i<a.length;i++) {
		sum = sum+a[i];
	}*/
	
	for(int val : a)
	{
		sum =sum+val;
	}
System.out.println(sum);
	}

}
