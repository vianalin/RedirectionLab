public class Tester{
	public static void main(String[] args) {
		
		System.out.println("testing pig latin simple: ");
		System.out.println(PigLatin.pigLatinSimple("hi").equals("ihay"));
		System.out.println(PigLatin.pigLatinSimple("anime").equals("animehay"));
		System.out.println(PigLatin.pigLatinSimple("E").equals("ehay"));
		System.out.println(PigLatin.pigLatinSimple("food").equals("oodfay"));
		System.out.println(PigLatin.pigLatinSimple("IamtheBEst").equals("iamthebesthay"));

		System.out.println("testing pig latin: ");
		System.out.println(PigLatin.pigLatin("the").equals("ethay"));
		System.out.println(PigLatin.pigLatin("check").equals("eckchay"));
		System.out.println(PigLatin.pigLatin("SKEE").equals("eeskay"));
		System.out.println(PigLatin.pigLatin("EmU").equals("emuhay"));
		System.out.println(PigLatin.pigLatin("grade").equals("adegray"));
	}
}