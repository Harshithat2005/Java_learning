package mypackage;

public class Print_prime_numers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,12,7};
		for (int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int cnt=0;
			for (int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(num);
			}
		}
	}

}
