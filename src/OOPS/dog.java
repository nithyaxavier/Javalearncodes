package OOPS;
//Subclass which has parent class(sinAnimal)- Single inhertance and Hirerical inhertance
//Subclass1 (DOg) which has subchild Breed.- multilevel inheritance
public class dog extends sinAnimal{

	String name = "dog1";
	String subname = "jimmy";
	
	public String dogmetod() {
		
//System.out.println(super.eat());using super keyword we can call the immediate parent class method
		return "Dog ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog d = new dog();
	
		System.out.println(d.dogmetod()+ d.animetod());//here usign + operato
		//i have joined two methods.
	
	}

}
