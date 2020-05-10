//the below program is for both if, if else, nested if.

public class ifelscond {

	void num (int a)
	{
		if(a<40 &&a>20)//'&&' operator is used so that it will check both the conditions.
		{
			System.out.println("Pass");
				}
	
		
		else if( a<100 &&a>90) {
		System.out.println("1st class");
			
	}
		else if( a<60 &&a>40) {
			System.out.println("2nd class");
				
		}
	
	else 
	{
		System.out.println("fail");
	}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ifelscond n = new ifelscond();//creating instance for a class
		n.num(22);//calling the 'num' above method using object 'n'
		n.num(95);
		n.num(50);
		n.num(1);
	}

}
