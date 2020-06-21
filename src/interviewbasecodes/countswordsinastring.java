package interviewbasecodes;

public class countswordsinastring {

	public static void main(String[] args) {
	String s = "I am a tester";
	int count =1;
	
	for(int i=0;i<=s.length()-1;i++)
	{
	if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')) {
		count++;
	}

	}
System.out.println(count);
}
}

