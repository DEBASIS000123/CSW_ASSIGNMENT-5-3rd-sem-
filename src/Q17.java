import java.util.Scanner;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("The number is "+isEven(n));
	}
	public static String isEven(int n) {
		String arr[]= {"Even","Odd"};
		return(arr[n%2]);
	}
}
