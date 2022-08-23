package JavaProblems;

import java.awt.Event;
import java.nio.channels.NonReadableChannelException;
import java.util.Iterator;

public class ReverseaString {
	public static void main(String[] args) {
		String str = "ABCD";
		String rev = "";
//		int len = str.length();
//		for(int i=len-1; i>=0; i--) {
//			rev = rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		//By using string array 
//		char [] a= str.toCharArray();
//		int len =a.length;
//		for (int i = len-1; i >=0; i--) {
//			rev=rev+a[i];
//		}
//		System.out.println(rev);
//		}
	
	//by using string buffer
//	StringBuffer sb = new StringBuffer(str);
//	System.out.println(sb.reverse());
	
	//by using string builder
	StringBuilder sbd = new StringBuilder();
	sbd.append(str);
	System.out.println(sbd.reverse());
	
	
}
}
