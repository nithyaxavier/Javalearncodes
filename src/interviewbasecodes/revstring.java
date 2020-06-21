package interviewbasecodes;

public class revstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "CRAFT";
		String rev="";
		/*int l = r.length();
		
for (int i =l-1; i>=0;i--)

{
rev = rev + r.charAt(i);
}
System.out.println(rev);*/

/*String buffered class*/
StringBuffer sb = new StringBuffer(r);
StringBuffer s = sb.reverse();
System.out.println(s);
/*USING char array--char[]*/
char a[] = r.toCharArray();
int len = a.length;
for (int i =len -1; i>=0;i--)
{
	rev = rev+a[i];
	
}
System.out.println("rev using char array : " +rev);
	}

	
}
