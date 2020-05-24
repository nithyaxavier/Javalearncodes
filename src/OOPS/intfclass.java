package OOPS;
//interface1
public class intfclass implements intf1 {

	
	public static void main(String args[]){  
		intfclass n = new intfclass();
		n.me3();
		n.me2();
		n.me1();
		
}

	@Override
	public void me1() {
		// TODO Auto-generated method stub
		System.out.println("override me1");
	}

	@Override
	public void me2() {
		// TODO Auto-generated method stub
		System.out.println("override me2");
	}
	
}
