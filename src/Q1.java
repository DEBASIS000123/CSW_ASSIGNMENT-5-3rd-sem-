import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		System.out.println("No of 1 prresent in the number "+n+" is :"+count_bit(n));
	}
	public static int count_bit(int n) {
		int c=0;
		while(n!=0) {
			c+=(n&1);
			n=n>>1;
		}
		return c;
	}
}
