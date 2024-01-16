import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		for(int i=0;i<10;i++) {
			int c=0;
			int temp=n;
			while(temp!=0) {
				int rem=temp%10;
				if(rem==i) {
					c++;
				}
				temp=temp/10;
			}
			if(c>0) {
				System.out.println("Frequency of "+i+" is :"+c);
			}
		}
		
	}
}
