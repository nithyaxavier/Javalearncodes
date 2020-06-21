package interviewbasecodes;

public class largestof3number {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		int c = 30;
		/*if(a>b && a>c)
		{
		System.out.println("A is greater :" +a);
	}
		else if(b>a && b>c) {
			System.out.println("B is greater :" +b);	
		}
		else if(c >a && c>b)
		{
			System.out.println("C is greater :" +c);
}*/
	//using ternary operator.
		//int largest = a>b?a:b;//large of a and b , store in laregts variable.
		//largest = largest>c?largest:c;//large of largest and c.
		int largest = c>(a>b?a:b)?c:(a>b?a:b);//simple way using ternary operator
		System.out.println("largest no: " +largest);
	}
}
	
