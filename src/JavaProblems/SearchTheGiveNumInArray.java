package JavaProblems;

import java.util.Arrays;

public class SearchTheGiveNumInArray {
	public static void main(String[] args) {
		int a[]= {10,20,3,50,50,60,70};
		System.out.println(Arrays.toString(a));
		int search_num=70;
		boolean flag = false;
	for(int i=0;i<a.length;i++) {
		if (a[i]==search_num) {
			System.out.println("number is found and it is at this index = " +i);
			flag = true;
			break;
		}
	}
	
	if (flag==false) {
		System.out.println("number is not found");
	}
	
	}

}
