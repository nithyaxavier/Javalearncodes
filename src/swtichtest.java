//swtich program with break option
public class swtichtest {

	void swtchk (int a)
	{
	switch(a) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tue");
	case 3:
		System.out.println("wed");
	case 4:
		System.out.println("thus");
	
	
	case 5:
		System.out.println("Friday");
	case 6:
		System.out.println("Sat");
		default :
			System.out.println("No days");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swtichtest sn = new swtichtest();
		sn.swtchk(8);
		sn.swtchk(6);
		
	}

}
