/*Below prgm is to read excel file 
 * Here we are using xssf because for xls we use this class file*/
 
package learnjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fw = new File("C:\\Files\\work.xlsx");//create file object
		//FileInputStream  f = new FileInputStream(fw);//to create connection first create reader.
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(fw));//to go workbook we are using this class
		//XSSFSheet sht = new XSSFSheet();//to go to sheet
		//below line is for getting that sheet
		XSSFSheet sht1 = wb.getSheet("Test");
		XSSFRow row = sht1.getRow(0);
int a = row.getLastCellNum();
	System.out.println(a);
	for(int i=0; i<=a ; i++) {
		
		int  s = row.getFirstCellNum();
		System.out.println(s);
		
		}
	}
		
	}



