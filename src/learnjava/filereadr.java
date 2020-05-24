
//below prgm is for File Reader and Buffered Reader
package learnjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereadr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File mf = new File ("C:\\Files\\sample.txt") ;
		 
		 //file reader below codes am reading the complete file char by char
		FileReader rd = new FileReader(mf);//created obj for file reader class
		/*int i;
		 while((i=rd.read())!= -1) 
			 System.out.println((char)i);//typecasting
		 rd.close();*/
		 
		 BufferedReader bdf = new BufferedReader(rd);// this class is use to read the complete strings in the file
		
		 String i;
		 while((i=bdf.readLine())!= null ) 
			 System.out.println(i);
		 
	}

}
