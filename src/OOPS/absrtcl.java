package OOPS;
//this abstart class , we are using abschild to override the unimplemented method and show the implement method
//abstract class in class name we should declare it as abstart.
//method name should have abstract when we not including body details.
//combination of abstract and non abstrt methos is called abstrt class.
//we can use this methods inside in this class in child class with help of inheritance concept.
public abstract  class absrtcl {
//below is implemented method 
	void smpab() {
		System.out.println("Hello");
	}
abstract void smpab2();//un-implemented method.
}
