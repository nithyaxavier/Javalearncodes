package OOPS;
/*Binding data members and variables into single unit. Inside class we are setting all var as private so that 
any confiendtail info cannot be overriden. Inorder to acess that in other class by using public method we can do it.
Using getter and setter method we can give values to class and get o/p.*/

public class encap1 {
private String name ;
private int accno;
public void setName(String name) {
	this.name=name;

}
public void setAccno(int  accnor) {
	if(accnor>1000) {
	this.accno=accnor;
	
}
	else {
		System.out.println("invalid accnumber");
	}
}

public String getName() {
	return name;
	
}
public int getAccno() {
	return this.accno;
	
}
}
