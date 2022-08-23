package JavaProblems;

public class Reverseanumber {
public static void main(String[] args) {
	int num =1234;
//	int rev=0;
//	while(num!=0) {
//		rev = rev*10+num%10;//0+4=4 //40+3=43  //43+2=432 //432+1=4321
//		num=num/10;//123 
//		}
//	System.out.println(rev);
	
	//by using string buffer
	StringBuffer sB = new StringBuffer(String.valueOf(num));
	StringBuffer rev = sB.reverse();
	System.out.println(rev);
	
	//by using string builder
	StringBuilder sbl = new StringBuilder();
	sbl.append(num);
	System.out.println(sbl.reverse());
}
}
