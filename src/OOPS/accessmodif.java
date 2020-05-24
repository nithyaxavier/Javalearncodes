package OOPS;
//here example for access modifier
//we can acess Private instance var and private method only within that class.
//creating one more class and trying to access public & protected var and methods

public class accessmodif {
int def = 5;
	public int puba =10;//can be acess outside class or outside package
	private int pria1 =11;//can be acessed only within this class.
	protected int proa3 = 12;//can be acesed outside class and pacakge by creating inheritance
	
	public void public1() {
		System.out.println("public method");
		}
	private void priv2() {
		System.out.println("private method");
		}
	protected void protec3() {
		System.out.println("protected method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessmodif ac = new accessmodif();
		System.out.println(ac.pria1);//private var
		ac.priv2();//private metod
		System.out.println(ac.def);//default modidifer
		
	
}
}
