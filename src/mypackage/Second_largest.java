package mypackage;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,12,7};
		int large=0;
		int sec_large=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				sec_large=large;
				large=a[i];	
			}
			else if(a[i]>sec_large)
			{
				sec_large=a[i];
			}
		}
		System.out.println(sec_large);

	}

}
