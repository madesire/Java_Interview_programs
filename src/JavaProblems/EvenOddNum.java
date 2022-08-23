package JavaProblems;

public class EvenOddNum {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,6,17,19};
		int even_count=0;
		int odd_count=0;
		for(int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
//				even_count++;
			System.out.println("The even numbers are = "+a[i]);
			}
			else { 
				System.out.println("The odd numbers are = "+a[i]);
			}
		}
//		System.out.println(even_count);
//		System.out.println(odd_count);
	}

}
