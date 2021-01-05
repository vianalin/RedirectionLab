public class Tester{
	public static void main(String[] args) {
		
		//testing pig latin simple
		String one = "hi";
		System.out.println(PigLatin.pigLatinSimple(one).equals("ihay"));

		String two = "anime";
		System.out.println(PigLatin.pigLatinSimple(two).equals("animehay"));

		String three = "E";
		System.out.println(PigLatin.pigLatinSimple(three).equals("ehay"));

		String four = "food";
		System.out.println(PigLatin.pigLatinSimple(four).equals("oodfay"));

		String five = "IamtheBEst";
		System.out.println(PigLatin.pigLatinSimple(five).equals("iamthebesthay"));
	}
}