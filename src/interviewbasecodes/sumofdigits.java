package interviewbasecodes;
// sum of digits in number
public class sumofdigits {

	public static void main(String[] args) {
		int num =1234;
		int sum =0;
		//int lnum =0;
		while(num>0)
		{
			
			sum = sum+num%10;
			num=num/10;
		}
		
		
		System.out.println(sum);

	}

}
