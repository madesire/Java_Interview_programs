package JavaProblems;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String s = "@$Rushi102";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		s=s.replaceAll("\\d", "");
		System.out.println(s);
		String s1=s.replaceAll("[^0-9]", "");
		System.out.println(s1);
		//remove white spaces from a string
		String sz = "i love india";
		sz=sz.replaceAll("[^a-zA-Z0-9]", sz);
		sz=sz.replaceAll("\\s", "");
		
		System.out.println(sz);
	}

}
