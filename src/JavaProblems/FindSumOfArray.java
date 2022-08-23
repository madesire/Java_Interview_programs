package JavaProblems;

public class FindSumOfArray {
	public static void main(String[] args) {
		int a[]= {10,20,3,50,40};
		int sum = 0;
//		System.out.println(a.length);
//		for(int i=0; i<=a.length-1;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		//by using enhanced for loop
		for (int i : a) {
			sum = sum+i;
			}
		System.out.println(sum);
	}
}

