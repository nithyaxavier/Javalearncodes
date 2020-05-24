package learnjava;
//below prgm is for single dimensional array
public class singdary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] ar = {1,2,3};//one way of intiating array and assigning it value
int ar1 = ar.length;// to get length of the array
	//System.out.println(ar1);
	//System.out.println(ar[0]);//to print the conetnt in that index.
	//System.out.println(ar[2]);
	
	int[] ar2 = new int [4];//one way of intitating array
	//below flow for assinging value to it
	ar2[0]= 5;
	ar2[1]=4;
	ar2[2]=8;
	ar2[3]=10;
	//System.out.println(ar2[2]);
	for(int a : ar2) { 
	
	
	System.out.println(a);
	}

}
}
