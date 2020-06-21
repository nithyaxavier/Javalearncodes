package interviewbasecodes;
//factorial of a num is the multiply of number by every number below it.
//5 = 5*4*3*2*1 = 120.
public class factorialofnum {

	public static void main(String[] args) {
		
int num =5;
long fact = 1;
long factl = 1;
for (int i=1; i<=num; i++)
{
	fact = fact *i;//intially 1 *1 = 1
	}
for(int j = num; j>=1;j--) {
	factl = factl *j;
}
System.out.println("factorial of num : " +fact);
System.out.println("factorial of num2 : " +factl);
	}

}
