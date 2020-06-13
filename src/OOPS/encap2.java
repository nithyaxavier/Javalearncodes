package OOPS;
//using encap1 methos in this class
public class encap2 extends encap1 {
public static void main(String[] args) {
	encap1 e = new encap1();
	e.setAccno(100);
	System.out.println(e.getAccno());
	e.setName("nht");
	System.out.println(e.getName());
}
}
