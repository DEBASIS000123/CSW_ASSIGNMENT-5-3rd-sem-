import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int c=0;
		int num=2;
		System.out.println("First "+n+" prime numbers are :");
		while(true) {
			if(isPrime(num)) {
				c++;
				System.out.println(num);
			}
			num++;
			if(c==n) {
				return;
			}
		}
	}
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c>0) {
			return false;
		}
		return true;
	}

}
