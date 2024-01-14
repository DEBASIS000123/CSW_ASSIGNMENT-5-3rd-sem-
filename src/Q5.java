import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to multiply :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The multification of "+a+" and "+b+" is:"+multiply(a,b));
	}
	public static int multiply(int x,int y) {
		int sum=0;
		while(x!=0) {
			if((x&1)!=0) {
				sum=add(sum,y);
			}
			x=x>>1;
			y=y<<1;
		}
		return sum;
	}
	public static int add(int x,int y) {
		int carry;
		if(y!=0) {
			carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		return x;
	}

}
