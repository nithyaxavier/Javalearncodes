package interviewbasecodes;

import java.util.Arrays;

public class equaloftwoarray {
//below program is a simple way to check equality usong Arrays class.
	public static void main(String[] args) {
	int [] a = {1,1,1,1,2};
	int [] b = {1,1,1,1,2};
	/*boolean status = Arrays.equals(a, b);
	if(status==true)
	{
		System.out.println("Array a is equal to Array b");
	}
	else {
		System.out.println("Arrays are not equal");
	}*/
	
//below prgrm using for loop and if condition
boolean status = true;
if(a.length==b.length)
{	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=b[i])
		{
			status = false;
		}
	}
}

else {
	status = false;
}
if(status == true)
{System.out.println("Array a and b are equals");
}
else{
	System.out.println("arays are not eql");
}
}
}