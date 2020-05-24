package learnjava;

public class Nestedtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//int [] r = {1,2,3};
	//System.out.println(r[5]);
	try {
		String n = null;
		n.length();
		try {
			int a = 50/8;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("arithmetic except");
		}
		
	}
	catch(NullPointerException e) {
		System.out.println("null n");
		
	}

}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("try1exc");

	}
	


	}

}
