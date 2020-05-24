package OOPS;
// parent class or superclass
//sinAnimal used as a parent class in DOg and cat(Hierarichal inhert.
public class sinAnimal {
	
	String name = "Animal";
	
	public String animetod() {
		
		
		return "is a part of animal";
	}
	public String eat() {
		
		return " which has eating habit";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sinAnimal ani = new sinAnimal();
	
		System.out.println(ani.animetod());
	}

}
