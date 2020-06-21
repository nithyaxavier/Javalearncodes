package interviewbasecodes;

import java.util.Scanner;

/*below prgm for reversing a string or number*/
public class revnumber {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	int num = s.nextInt();//storing the input which we are giving in run time
	/*using string buffer class
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	System.out.println(sb.reverse());*/
	/*using string builder class
	StringBuilder sb1 = new StringBuilder();
	System.out.println(sb1.append(num).reverse());*/
	/* USING ALGORITHM*/
	int rev =0;
	while(num!=0)
	{
		rev = rev*10 + num%10;
		num = num/10;
	}
System.out.println(rev);
	}

}
