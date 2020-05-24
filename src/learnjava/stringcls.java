package learnjava;

public class stringcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//below st1 and st2 are refernce value that will have same memory in scp.
		String st1 = "i am string";
		String st2 = "i am string";
//below str and str1 has different instance or memory created in heap memory
		String Str = new String("am a string");
		String Str1 = new String("am a am string");
		
		Str1.
		
		System.out.println(st1==st2);//== is used to compare the refernce value
		System.out.println(Str==Str1);// here we are comparing two refernces.
		System.out.println(st1.equals(st2));//equals is used to compare actual value
		System.out.println(Str.equals(Str1));//here it compare the actual value inside the refences
		
	}

}
