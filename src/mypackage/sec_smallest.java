package mypackage;

public class sec_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,4,12,7};
		int small=Integer.MAX_VALUE;
		int sec_small=Integer.MAX_VALUE;;
		for (int i =0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				sec_small=small;
				small=a[i];
			}
			else if(a[i]<sec_small)
			{
				sec_small=a[i];
			}
		}
		System.out.println(sec_small);
	}

}
