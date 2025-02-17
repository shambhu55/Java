/*
WAP to reverse each element from array.
*/

import java.util.Arrays;
class ReverseEachElement2
{
	public static void main(String args[])
	{
		int a[]={239, 152, 569, 782};

		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			while(a[i]!=0){
				sum*=10;
				sum+=a[i]%10;
				a[i]/=10;
			}
			a[i]=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}