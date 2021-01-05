import java.util.*;

public class PigLatin {
	public static void main(String[] args) {
		
			
	}

	//pig latin 1
	public static String pigLatinSimple(String s) {
		//given a single word of at least 1 character:
		//if the word starts with a,e,i,o,u, add "hay" to the end of the word
		//else, move the first letter to the end and add "ay" to the word
		//output should be lowercase to avoid issues with capitalization
		s = s.toLowerCase();
		char first = s.charAt(0);
		if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') return s + "hay";
		else return s.substring(1) + first + "ay";
	}

	//pig latin 2
	public static String pigLatin(String s) {
		//given a single word of at least 1 character:
		//if the word starts with any digraph (listed below), add "ay"
		//if the word starts with any vowel, add "hay" 
		//else move the first letter to the end and add "ay"
		//output should be lowercase to avoid issues with capitalization
		s = s.toLowerCase();
		ArrayList<String> digraphs = new ArrayList<>(Arrays.asList(new String[] {
			"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr",
			"ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
			"st", "sw", "th", "tr", "tw", "wh", "wr"}));
		if(s.length() > 1 && digraphs.contains(s.substring(0,2))) return s.substring(2) + s.substring(0,2) + "ay";
		return pigLatinSimple(s);

	}
}