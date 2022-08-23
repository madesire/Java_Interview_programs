package JavaProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.xml.transform.Source;

public class ArraySorting 
{
	public static void main(String[] args) 
	{
		//for descending order
		Integer a[]= {4,2,1,3,5};
		Arrays.parallelSort(a);
		System.out.println("Array before sorting" +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array before sorting" +Arrays.toString(a));
		for (int i=1; i<=a.length; i++) {
			System.out.println("array "+i);
		}
		
		System.out.println("Array before sorting" +Arrays.toString(a));
		for (int i=0; i<a.length; i++)
		{
			for (int j = 0; j <a.length; j++) 
			{
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting"+Arrays.toString(a));
		
		//by using treeeset
//		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(a));
//		System.out.println("by using treeset"+ts);
		
		//for assending order
		int b[] = {1,2,5,7,3,4,6,8};
		System.out.println("Array before sorting" +Arrays.toString(b));
		int temp;
		for(int i=0; i<b.length;i++) 
		{
			for (int j = i; j < b.length; j++) 
			{
				if (b[i]>b[j]) {
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
				
			}
			
		}
		System.out.println("Array after sorting" +Arrays.toString(b));
		
		
	
	}

}
