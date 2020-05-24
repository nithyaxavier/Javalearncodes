package OOPS;
//this interface used in intfclass.java
public interface intf1 {
public void me1(); 
public void me2(); 
 default void me3() {
	 System.out.println("default method");
 }
}
