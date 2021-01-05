import java.util.*;

public class MakeStars {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); //all text
		while(all.hasNextLine()) {
			Scanner line = new Scanner(all.nextLine()); //line of text
			while(line.hasNext()) {
				String word = line.next(); //word
				String stars = ""; //empty string to add stars for each letter
				for(int i = 0; i < word.length(); i++) { //adding * to stars for each amount of letters
					stars += "*";
				}
				System.out.println(stars + " "); //printing * with a space
			}
			System.out.println(); //printing new line after each line
		}
	}
}