package learnjava;
//outside class & outside packgae can acess public easliy by creating obj for that class1.
//in case of protected we cannot use it direclty so use interface implementation to acess protected .
import OOPS.accessmodif;

//final variable 
public class disp extends accessmodif  {
	final int speedlimit=90;//final variable  
	public void disp1() {
		 //speedlimit = 100;
	} 
	//final public  void disp4() {
		
	//System.out.println("final method");
//}
	//public  void disp4() {
		
		//System.out.println("rewrite final method");
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp t = new  disp();
	System.out.println(t.speedlimit);
		//t.disp1();
		//t.disp6();
	accessmodif a = new accessmodif();
	a.public1();
	t.protec3();//protected method is accessed here by creating obj for child class.
	
	}

}
