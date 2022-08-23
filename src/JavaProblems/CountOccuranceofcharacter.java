package JavaProblems;

import java.util.Iterator;

public class CountOccuranceofcharacter {
	public static void main(String[] args) {
		String s = "Java programming langauge with oops";
		int totalcount = s.length();
		int afterremove =  s.replaceAll("g", "").length();
	    int countofchar = totalcount-afterremove;
	    System.out.println(countofchar);
	    
	}

}
