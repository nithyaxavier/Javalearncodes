package interviewbasecodes;

public class removejunkinstring {

	public static void main(String[] args) {
		String s = "543453434%$$hgh#@@HVHVH35434%%%%%Hai";
		String rs = s.replaceAll("[^a-zA-Z0-9]", "");//this will remove junk items in string
		System.out.println(rs);
		String a = "Hai i am a tester";
		String rss = a.replaceAll("\\s", "");//removing white spaces in string
		System.out.println(rss);
		/*below codes for counting the no of char ocurrences in a string*/
		int count ;
		int len = a.length();
		System.out.println(a.replaceAll("t", ""));
	int lena = a.replaceAll("t", "").length();
	 count = len - lena;
	System.out.println(count);

	}

}
