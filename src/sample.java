
/**
 * @author user
 *
 */
public class sample {//intializising class

	int a =1;//it says a is a integer and it holds value equal to1
	int b = a+2;//it says b is a integer and it holds value equal of a
	void t1() {//method1
		
		System.out.println("a;" +a);
	}
void t2() {//method2
		
		System.out.println("b;" +b);
	}
	public static void main (String[] args)//main method
	{
		sample nw = new sample();//creating instance for class
		nw.t1();//calling result of m1
		nw.t2();//calling result of m2
		
	}
}
