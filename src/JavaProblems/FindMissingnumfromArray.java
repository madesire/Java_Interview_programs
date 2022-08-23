package JavaProblems;

public class FindMissingnumfromArray {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,6};
		int sum1=0;
		for(int i=0; i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("The sum1= " +sum1);
		int sum2=0;
		for(int i=1; i<=6; i++) {
			sum2=sum2+i;
		}
		System.out.println("The sum2 = "+sum2);
		System.out.print("The missing num is = ");
		System.out.println(sum2-sum1);
		
	}

}
