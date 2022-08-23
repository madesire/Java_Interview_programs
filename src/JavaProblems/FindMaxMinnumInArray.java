package JavaProblems;

import javax.sql.rowset.JoinRowSet;
import javax.xml.transform.Source;

public class FindMaxMinnumInArray {
	public static void main(String[] args) {
		int a[]= {0,20,30,40,50,60,70};
		int max= a[0];//10
		int min=a[0];
		for(int i=1; i<a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
