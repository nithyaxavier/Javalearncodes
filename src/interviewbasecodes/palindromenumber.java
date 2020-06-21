package interviewbasecodes;

import java.util.Scanner;

public class palindromenumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		int onum = num;
		
		int rev =0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
if(onum==rev)
{
	System.out.println("The numebr is palindrome : " +rev);
}
else
{
	System.out.println("Numebr not paindrome" +rev);
}
		}	
	}

