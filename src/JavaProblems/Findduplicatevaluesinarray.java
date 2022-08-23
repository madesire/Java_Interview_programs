package JavaProblems;

import java.util.HashSet;
import java.util.Iterator;

public class Findduplicatevaluesinarray 
{
	public static void main(String[] args)
	{
//		String a[]= {"java","abc","bdc","cba","mca","java"};
		int a[] = { 10, 20, 3, 0, 4,4,10 };
		boolean flag = false;
//		for (int i = 0; i < a.length-1; i++) 
//		{
//			for (int j = i + 1; j < a.length; j++) 
//			{
//				if (a[i] == a[j]) 
//				{
//					System.out.println("the duplicate num is " + a[i]);
//					flag = true;
//				}
//			}
//		}
//		if (flag ==false) 
//		{
//			System.out.println("Sorry duplicate num is not found");
//		}
		
		
		//by using hashset
		HashSet<Integer> hs= new HashSet<>();
		for(int val:a) {
			if (hs.add(val)==false) {
				System.out.println("the duplicate value is = " +val);
			}
			
		}
//		System.out.println(hs);

	}
}
	
