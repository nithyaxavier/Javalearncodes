package interviewbasecodes;
//prime number is a number greater than 1
// number divided by 1 and by itself.
public class primenumornot {

	public static void main(String[] args) {
	int num =33;
	int count =0;
	if (num>0)
	{
for(int i=1; i<=num; i++)
{
	if(num%i==0)
	count++;
}
	if(count==2)
	{
		System.out.println("Its a prime" +num);
	}else
	{
		System.out.println("not a prime " +num);
	}
}
	
	else
	{
		System.out.println("not a prime number");
	}

}
}