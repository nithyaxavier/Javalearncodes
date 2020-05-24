package OOPS;
//method overloading or Complietime polymorphism or early binding or static polymorph
//below prgm has two examples
//1- same method diff number of arg and same method diff type of arg
//one more example is there smae method and diff seq of arg
public class methodoverld {
	//below two methods for same name, diff number of arg of same type
public int addition(int a , int b) {
	int c = a+b;
	return c;
}
public int addition(int a , int b ,int d) {
	int e = a+b+d;
	return e;
}
//below two methods for same name, diff type of arg
public String add(String f, String h) {
	String i = f+h;
	return i;
		}
public int add(int f, int h) {
	int i = f+h;
	return i;
	
	}
//below two methods for same name, diff seq of parameters
public String name(int a , String i) {
	String k = a+i;
	return k;
}
public String name( String i, int a ) {
	String k = a+i;
	return k;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverld md = new methodoverld();
	
		
		System.out.println(md.addition(3, 3));
		System.out.println(md.addition(3, 3,7));
		System.out.println(md.add("Nit", "ya"));
		System.out.println(md.add(10, 2));
				System.out.println(md.name("h",1));
				System.out.println(md.name(2,"k"));
		//int a2 = md.addition(4, 3);
	//System.out.println(a1);
	//System.out.println(a2);
	}

}
