package interviewbasecodes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriter {

	public static void main(String[] args) throws IOException {
//File Writer class
	FileWriter fw = new FileWriter("C:\\Sample\\test123.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	
	bw.write("selenium");
	bw.write("java");
	bw.write("Cs");
	bw.write("de");
	
	System.out.println("Done");
	bw.close();
	//Buffered reader
	FileReader fr = new FileReader("C:\\Sample\\test123.txt");
	
	BufferedReader br = new BufferedReader(fr);
	String s;
	while((s= br.readLine())!=null)
	{
		System.out.println(s);
	}
	br.close();
	System.out.println("done reading");
	/*using scanner and file
	 * Scanner sc - new Scanner(fr);
	 * while(sc.hasnextline)
	 * {
	 * syso(sc.nextline);
	 */
	}
	


}
