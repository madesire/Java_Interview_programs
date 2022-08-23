package JavaProblems;

import java.util.Iterator;

import javax.xml.transform.Source;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str= "Welcome to java";
		//approach1 
//		String[] newstr= str.split(" ");
//		String restr = " ";
//		for(String words:newstr) {
//			String reswords=" ";
//			System.out.println(words);
//			for (int i =words.length()-1; i >= 0; i--) {
//				reswords = reswords+words.charAt(i);
//			}
//			restr =restr+reswords+" ";
//		}
//		System.out.println(restr);
		
		//approach 2 
		String[] newstr= str.split(" ");
		String reverseword ="";
		for(String w:newstr) {
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		reverseword = reverseword+sb.toString()+" ";
		}
		System.out.println(reverseword);

	}

}
