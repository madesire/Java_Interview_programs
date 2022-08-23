package JavaProblems;

import java.util.Iterator;

public class FindFactorial {
	public static void main(String[] args) {
		int num=500;
		long factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
		
		}
		System.out.println(factorial);
	}
}
