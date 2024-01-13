import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		System.out.println("Enter the ith and jth position to swap :");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("After swapping the position the new number become :"+swap(n,i,j));
	}
	public static int swap(int n,int i,int j) {
		if(((n>>i)&1)!=((n>>j)&1)) {
			n=n^((1<<i)|(1<<j));
		}
		return n;
	}
}
