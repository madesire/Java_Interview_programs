package JavaProblems;

import javax.sql.rowset.JoinRowSet;

public class countOddEveninnum {
	public static void main(String[] args) {
		int num = 123456789;
//		int new_num = 0;
//	    while(num!=0) {
//	    	new_num = new_num*10+num%10;
//	    	num=num/10;
//		if (new_num%2==0) {
//			System.out.println("num is even");
//		}
//		else {
//			System.out.println("num is odd");
//		}
//	}
		int even_count = 0;
		int odd_count=0;
		while(num>0) {
			int rem= num%10;
			if (rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		num=num/10;
	}
		System.out.println(even_count);
		System.out.println(odd_count);
}
}
