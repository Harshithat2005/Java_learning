package mypackage;

public class Arrays_print_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,12,7};
		int n=arr.length;;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
