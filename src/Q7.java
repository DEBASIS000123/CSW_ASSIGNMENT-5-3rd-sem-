import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y :");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The power of "+x+" by "+y +" is:"+power(x,y));
	}
	public static int power(int x ,int y) {
		
		int pow=1;
		if(y<0) {
			y=-y;
			x=1/x;
		}
		while(y!=0) {
		if((y&1)!=0) {
			pow*=x;
			}
		x*=x;
		y>>=1;
		}
		return x;
	}
}
