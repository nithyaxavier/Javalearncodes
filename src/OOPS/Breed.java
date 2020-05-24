package OOPS;
//subclass2
public class Breed extends dog{
	String name ;
		
	public String Breedmetod() {
//in the below line using super keyword we can call the variable from immediate parent class to the child class
		System.out.println(super.subname);
		return "Lambrador ";
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Breed b = new Breed();
//below line print uses + operator overloading	
System.out.println(	b.Breedmetod()+b.dogmetod()+b.animetod()+b.eat());


	}
	

	
}
