public class PigLatin {
	public static void main(String[] args) {
		
			
	}

	public static String pigLatinSimple(String s) {
		//given a single word of at least 1 character:
		//if the word starts with a,e,i,o,u, add "hay" to the end of the word
		//else, move the first letter to the end and add "ay" to the word
		//output should be lowercase to avoid issues with capitalization
		s = s.toLowerCase();
		char first = s.charAt(0);
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		String result = "";
		for(int i = 0; i < vowels.length; i++) {
			if(first = i) result = s + "hay";
			else result = s.substring(1) + first + "ay";
		}
		return result;
	}
}