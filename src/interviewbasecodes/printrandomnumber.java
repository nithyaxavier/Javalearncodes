package interviewbasecodes;

import java.util.Random;

//printing random numbers and strings
public class printrandomnumber {

	public static void main(String[] args) {
	//using Random class.
Random ran = new Random();
int r = ran.nextInt(5);
System.out.println(r);
//using Math clas
System.out.println(Math.random());
//using Apache common lang API.
//RandomStringUtils.randomnumeric(5)--gives yoyu 5 didgit number
	}

}
