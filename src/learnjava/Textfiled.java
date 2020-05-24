//below prgm is for File Writer and Buffered writer

package learnjava;


import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class Textfiled {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 File mf = new File ("C:\\Files\\sample.txt") ;//create file object to the file class
 mf.createNewFile();//create file
 FileWriter wrt = new FileWriter(mf);
  //wrt.write("this");
 
  //wrt.write("i am a girl");
 BufferedWriter buffer = new BufferedWriter(wrt);//created class for writer
 for(int i=0; i<5; i++)
 {
	 buffer.write("learning java");

	 buffer.newLine();
	 }
 
 buffer.close();

 



 }
	}
	


