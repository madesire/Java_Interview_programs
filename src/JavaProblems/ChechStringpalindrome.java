package JavaProblems;

import java.util.Iterator;

public class ChechStringpalindrome {
	public static void main(String[] args) {
	String sc = "abccba";
	String rev = "";
	int len = sc.length();
	for (int i=len-1; i>=0; i--) {
		rev=rev+sc.charAt(i);
	}
	System.out.println(rev);
	if(sc.equals(rev)) {
		System.out.println("The given string is palindrome");
	}
	else {
		System.out.println("the given string is not palindrome");
	}
	}
}
