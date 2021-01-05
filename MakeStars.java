import java.util.*;

public class MakeStars {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); 
		while(all.hasNextLine()) {
			Scanner line = new Scanner(all.nextLine()); 
			while(line.hasNext()) {
				String word = line.next(); 
				String stars = ""; 
				for(int i = 0; i < word.length(); i++) { 
					stars += "*";
				}
				System.out.println(stars + " "); 
			}
			System.out.println(); 
		}
	}
}