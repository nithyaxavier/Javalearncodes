package interviewbasecodes;

import java.util.Scanner;

public class palindrmstring {
	
	public static void main (String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter String");
		String s = "bhy";
		String orgst = s;
		String sr = "";
		int len = s.length();
		
		for (int i = len-1; i>=0;i--)
		{
		sr = sr + s.charAt(i);
	}
	System.out.println("Reverse string is : " +sr);
	if(sr.equals(s))
	{
		System.out.println("its a plaindrome");
		
	}
	else
	{
		System.out.println("Not a palindrome string");
	}
}
}
