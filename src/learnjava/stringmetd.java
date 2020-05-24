package learnjava;

public class stringmetd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1 = "I am Tester";
String S2 = "I am tester";
//System.out.println(S1.equals(S2));//this give you the comparison of values.
//System.out.println(S1.equalsIgnoreCase(S2));// this is just check the length it wont chekc the correct value
///System.out.println(S1.charAt(3));//this is return the character present in taht index number.
//System.out.println(S2.concat(" hai")); //this is add to the string
System.out.println(S1.length());//this will give u the lengh of string
//System.out.println(S1.toUpperCase());//this will give you the string in Caps
//System.out.println(S1.contains("z"));// this will return boolean value if the given char or string present in the line.
//System.out.println(S1.substring(2));// return the text after inder num 2.
//System.out.println(S2.substring(2, 10));//return the text from index 2 to 9.
//System.out.println(S1.indexOf("a"));//return the value of index in a.
String[] tr = S1.split(" ");


for (int i=0; i<tr.length ;i++)
{
System.out.println(tr[i]);

	}



}

}