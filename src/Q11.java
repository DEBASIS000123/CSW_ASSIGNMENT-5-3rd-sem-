import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int c=0;
		while(n!=0) {
			int rem=n%10;
			if(isEven(rem)) {
				c++;
			}
			n=n/10;
		}
		System.out.println("No of even digits are:"+c);
	}
	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}

}
