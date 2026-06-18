package mypackage;
public class Reverse_num {

	public static void main(String[] args) {
		int n=1234;
		int num=0;
		while(n>0) {
			int digit=n%10;
			num=num*10+digit;
			n=n/10;
		}
		System.out.println(num);
	}
}
