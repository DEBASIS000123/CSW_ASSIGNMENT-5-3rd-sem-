
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(8,2));
	}
	public static long divide(long x,long y) {
		long quotient=0,k,y2k;
		k=5;
		y2k=(y<<k);
		while(x>=y) {
			while(y2k>x) {
				y2k=y2k>>1;
				k=k-1;
			}
			quotient=quotient+(1<<k);
			x=x-y2k;
		}
		return quotient;
	}
	

	
}
