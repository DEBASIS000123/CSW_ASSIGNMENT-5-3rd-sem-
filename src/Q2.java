import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		System.out.println("The parity of the number "+n+" is :"+count_parity(n));
	}
	public static int count_parity(int n) {
		int parity=0;
		while(n!=0) {
			parity=parity^(n&1);
			n=n>>1;
		}
		return parity;
	}
}
