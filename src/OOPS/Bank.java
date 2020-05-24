package OOPS;
//this is my parent class
public class Bank {

	int a =0;
	public double homeloaninterest() {
		return 7.0 ;
		
	}
	public double carloaninterest() {
		return 6.0 ;
		
	}
	public double bikeloaninterest() {
		return 5.0 ;
		
	}
	public Bank() {
		System.out.println(" bank");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b = new Bank();
System.out.println(b.homeloaninterest());
	}

}
