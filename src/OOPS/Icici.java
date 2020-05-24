package OOPS;

public class Icici extends Bank {
	//int b = super.a;//here using super in instance variable
	
	public double bikeloaninterest() {
		
		return 2.0 ;
		
	}
	public double  homeloaninterest() {
	System.out.println(super.a);
		return super.homeloaninterest();//here using super in method level
		
	}
	public Icici() {
		System.out.println("ICIC bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici ic = new Icici();
		//Bank bi = new Bank();
	    System.out.println(ic.homeloaninterest());
		//System.out.println(ic.b);
		
		
	}

}
