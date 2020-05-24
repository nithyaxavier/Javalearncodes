package learnjava;
//below prgm is for two dimensional array
public class twodmary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] tar = {{1,2},{3,4}};//one way of intializing and assigning values to array, here we used 2*2 array
//System.out.println(tar[0][0]);
//System.out.println(tar[1][1]);
//System.out.println(tar.length);

for(int i=0; i<tar.length ; i++)//this will check outer index
{
	for(int j=0;j<tar[i].length; j++)//this will check inner index 
		{
		
		System.out.println(tar[i][j]);
	}	
	}
}

	}


