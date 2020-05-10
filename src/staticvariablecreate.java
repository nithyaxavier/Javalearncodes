
public class staticvariablecreate {

	int a = 10; // instance variable
	static int b = 20; // static variable
	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub

		staticvariablecreate var = new staticvariablecreate();//creating instance to call instance variable 
		staticvariablecreate var1 = new staticvariablecreate();
		System.out.println(var.a++  );// here the value is 10 and the next line it will be 10+1
		System.out.println(var.a);//here it is result of the above line
		System.out.println(var1.a++);// here the value is 10 and the next line it will be 10+1
		System.out.println(var1.a);//here it is result of the above line
		System.out.println(staticvariablecreate.b++);//for static variable, we can call using class name
		//here the value is 20 and the next line it will be 20+1
		System.out.println(staticvariablecreate.b);
		//here it is result of the above line
	}

}
