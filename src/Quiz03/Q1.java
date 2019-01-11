package Quiz03;

public class Q1 {
	public static void main(String[] args) {
		int a =0;
		int sum=0;
		for ( int i =0 ; i <=20; i++) {
			a=i;
			if ( !(a%2==0 || a%3==0)) {
				sum+=a;
			}
		}
		System.out.println("sum : " + sum);
	}
}
