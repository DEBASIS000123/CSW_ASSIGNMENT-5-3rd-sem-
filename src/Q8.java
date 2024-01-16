import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number to reverse :");
		int n=sc.nextInt();
		System.out.println("Reverse of the number is:"+reverse(n));
	}
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
