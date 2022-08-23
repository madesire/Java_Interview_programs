package JavaProblems;

import java.util.Iterator;

public class Checkthepalindromenum {
	public static void main(String[] args) {
		int pdn=16461;
		int rev = 0;
		int og_num=pdn;
		while(pdn!=0) {
		rev=rev*10+pdn%10;
		pdn=pdn/10;
		}
		boolean pdvalue= rev==og_num;
		System.out.println(pdvalue);
		if (rev==og_num) {
			System.out.println("the given num is palindrome");
		}
		else {
			System.out.println("the given num is not palindrome");
		}

	}
	

}
