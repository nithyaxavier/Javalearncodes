
//below prgram is for 'for loop',while loop and do while loop
public class loopprg {
	
	void loopt(int a) {
		for (int i=0;i<a;i++)
		{
			System.out.println(i);
		}
		while(a >0)
	{
		a--;
		System.out.println("run while test");
	}
	
	do {
		System.out.println("run do test case");
		a++;
	}
	while (a==4);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopprg nl = new loopprg();
		nl.loopt(4);
		
	}

}
