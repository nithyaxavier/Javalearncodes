package OOPS;
//the methods here are used frm absrtcl.java
public class abschild extends absrtcl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abschild as = new abschild();
		as.smpab();
		as.smpab2();
	}

	@Override
	void smpab2() {
		// TODO Auto-generated method stub
		System.out.println("unimp methods is implemeted in child class");
	}

}
