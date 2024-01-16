
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int num=2;
		System.out.println("First 100 prime numbers are :");
		while(true) {
			if(isPrime(num)) {
				c++;
				System.out.println(num);
			}
			num++;
			if(c==100) {
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
