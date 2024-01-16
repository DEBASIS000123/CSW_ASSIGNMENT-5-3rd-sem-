import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(firsttwodigit(n1));
		System.out.println(lasttwodigit(n2));
		int sum=firsttwodigit(n1)*100+lasttwodigit(n2);
		System.out.println("Sum="+sum);
	}
	public static int firsttwodigit(int n) {
		while(n>99) {
			n=n/10;
		}
		return n;
	}
	public static int lasttwodigit(int n) {
		int num=0;
		int i=0;
		while(i<2) {
			int rem=n%10;
			num=(int)(num+(rem*Math.pow(10,i)));
			n=n/10;
			i++;
		}
		return num;
	}
}
