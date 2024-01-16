import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two float numbers :");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		if((f1-f2)<1) {
			System.out.println("It is less than that value.");
		}
		else {
			System.out.println("It is not less than that value.");
		}
	}

}
