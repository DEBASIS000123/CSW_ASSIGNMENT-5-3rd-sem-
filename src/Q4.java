import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		System.out.println("After reversing the bits of "+n+" the new number become :"+reverse(n));
		
	}
	public static int reverse(int n) {
		int rev=0;
		for(int i=0;i<4;i++) {
			rev=rev<<1;
			rev=rev|(n&1);
			n=n>>1;
		}
		return rev;
	}
}
