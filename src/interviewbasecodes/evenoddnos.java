package interviewbasecodes;
//to count no of even and odd numbers in the list.
public class evenoddnos {

	public static void main(String[] args) {
		
int num = 12345;
int even_num = 0;
int odd_num =0;
while(num>0)
{
	int rem = num%10;
	if(rem%2==0)
	{
		even_num++;
		}else
		{
			odd_num++;
		}
	num = num/10;
}
System.out.println("even nos in the list :" +even_num);
System.out.println("odd nos in the list :" +odd_num);

	}

}
