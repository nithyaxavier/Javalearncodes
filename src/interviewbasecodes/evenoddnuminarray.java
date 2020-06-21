package interviewbasecodes;

public class evenoddnuminarray {

	public static void main(String[] args) {
int a [] = {1,6,9,8,4};
System.out.println("Even numbers.....");
/*for (int i=0;i<a.length;i++)
{
	if(a[i]%2==0)
	{
		
		System.out.println(a[i]);
		}
	}
System.out.println("Odd numbers----");
for (int i=0;i<a.length;i++)
{
	if(a[i]%2!=0)
	{
		
		System.out.println(a[i]);
		}
	}*/

for(int value : a)
{
	if(value%2==0) {
		System.out.println(value);
	}
}
	}

}
