import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("It is prime number.");
		}
		else {
			System.out.println("It is not prime number.");
		}
	}
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=2;i<Math.sqrt(n);i++) {
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
