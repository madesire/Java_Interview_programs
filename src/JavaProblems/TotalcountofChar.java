package JavaProblems;

import java.security.PublicKey;
public class TotalcountofChar {
	public static void main(String[] args) {
		String s = "welcome to java world of";
		int count =1;
		for(int i=0; i<s.length()-1; i++) {
			if ((s.charAt(i)==' ')) {
			count++;
			}
			
		}
		System.out.println(count);
	}

}
