import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check pallindrome :");
		int num=sc.nextInt();
		int rev=reverse(num);
		if(num==rev) {
			System.out.println("The number is a Pallendrome.");
		}
		else {
			System.out.println("The number is not a pallendrome.");
		}
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
