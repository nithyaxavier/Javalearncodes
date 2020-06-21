package interviewbasecodes;

public class reversewordsinstring {

	public static void main(String[] args) {
	/*String sent = "Hai hello how are you";
	String[] revsent = sent.split(" ");
	String revwors="";
	for(String  word:revsent)
	/*{
		String revword = "";
		for(int i = word.length()-1; i>=0;i--)
			//System.out.println(word.charAt(i));
			revword = revword+word.charAt(i);
		revwors = revwors + revword +" ";	
	}*/
		//using string builder class we can reverse word in a string
		String s = "Hai you are";
		String[] revsent = s.split(" ");
		String revword="";
		for(String w : revsent) {
	StringBuilder sb = new StringBuilder(w);
	//sb.reverse();
	//revword = revword+sb.toString()+" ";
	revword = revword+ sb.reverse()+ " ";
		}
	System.out.println(revword);
	}

}
