package JavaProblems;

public class SwappingtwoNumbers {
	public static void main(String[] args) {
		int a=10,b=20,z;
//		System.out.println("before swapping values are..." +a+" "+b );
//		z=a;
//		a=b;
//		b=z;
//		System.out.println("After swapping values are..." +a+" "+b );
		//by using mathematical logic
//		a=a+b;//30
//		b=a-b;//10
//		a=a-b;//20
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping values are... a=" +a+" b= "+b );
	}

}
