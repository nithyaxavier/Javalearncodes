package OOPS;


//outside class within package we can acess default, public & protected.
//by creating obj for that class1.
 public class pubaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessmodif p =new accessmodif();
		//System.out.println(p.proa3());//protected var
		p.protec3();
		int a =p.proa3;
		System.out.println(p.def);
			System.out.println(a);
p.public1();
		
	}

}
