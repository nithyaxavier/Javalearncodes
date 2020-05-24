package OOPS;
//superclass-sinAnimal
//subclss 1 - Dog
//subclass 2- cat
public class cat extends sinAnimal{
	String name = "cat ";
	
	public String catmed() {
		return name;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c = new cat();

		System.out.println(c.catmed()+c.animetod() + c.eat());
		
	}

}
