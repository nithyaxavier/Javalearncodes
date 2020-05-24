/*Below prgm is to get values from properties file.
 * 1. Create a propertes file from, Java package ->right click->new->General->file.
 * After creating give some values inside the file then come here.
 */

package learnjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class fileproph {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
/*below line is mandatory its a file connection, this will fetch the path of file*/
File pf = new File("C:\\Users\\user\\eclipse-workspace\\Javalearn\\src\\learnjava\\properties");
/*Below is for FileReader this is equal to Inputstream*/
FileReader fg = new FileReader(pf);
Properties pop = new Properties();//here i have created object for properties class
pop.load(fg);//load is used for reading a data from file
String s = pop.getProperty("Browser");//using getproperty we get all the details from properties file.
String s1 = pop.getProperty("env");
String s2 = pop.getProperty("DBname");
System.out.println(s);
System.out.println(s1);
System.out.println(s2);
/*below code is for write content into properties file*/
//FileWriter fw = new FileWriter(pf);
String path ="C:\\Users\\user\\eclipse-workspace\\Javalearn\\src\\learnjava\\mfile.properties";
FileOutputStream nf = new FileOutputStream(path);
try {
pop.setProperty("name", "nty");
pop.setProperty("username", "gimmy");
pop.setProperty("password", "pwd1");
pop.put("keyword", "key1");
pop.put("key2", "rt");

pop.store(nf, s1);//Outputstream it will connect file for writing purpose.
	}
	catch(IOException e ) {
		e.printStackTrace();
	}

}
}