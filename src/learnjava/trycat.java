//Below program is for simple try catch block, Mulitple catch
/*This is mainly used for, whenever we are writing any program or script that we know somewhere issue will come
so that time that part we can include in try and those exception we can have it in catch block with generic format
or coder format*/
/*We cannot have two exception with same name*/
/*If we are using two catch blocks then 1st time u intitated Generic exception, then 2nd time it will not allow
 * you to do specific exception,it will throw compile time error*/
/*If we have two catch blocks, 1st is specfic exception then 2nd is generic then that time the specific exception will work*/
/*finally block is used such that whatever happens in the code, if it failed or pass, the codepart inside 
 * finally block will execute for sure.
 */
package learnjava;
public class trycat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//String name = null;
	//name.length();

	
	int [] ar = {10,2};
	System.out.println(ar[3]);
}
catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
	System.out.println("out of index");
}

catch(Exception e)//this is Parent class or Generic exception
{
	e.printStackTrace();//using this method we can get wat type of exception it is
	System.out.println("name should not be empty");// this is like a statement that user can see.
	}

finally {
	System.out.println("Show my code whatever happens,");
	//System.out.println();
	//System.out.println("even there is failure or pass in my test");
}
}
	}
	




