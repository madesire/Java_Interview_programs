package JavaProblems;

import java.util.Arrays;
import java.util.Iterator;

public class checkarrayequality {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
//		boolean equalarray = Arrays.equals(a, b);
//		System.out.println(equalarray);
//		for(int i=0; i<a.length; i++) {
//			for(int j =0; j<b.length; j++) {
//				if (a[i]==b[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}
		boolean status =true;
		if (a.length==b.length) {
		for(int i=0; i<a.length; i++) {
			if(a[i]!=b[i]) {
				status =false;
			}
		}
		}
		else {
			status=false;
		}
		if (status==true) {
			System.out.println("Array is same");
		}
		else {
			System.out.println("Array is not same");
		}
	
	}

}