/*
WAP to add sum at the end of elements from array.

*/

import java.util.Arrays;
class AddSumAtEnd
{
	public static void main(String args[])
	{
		int a[]={12,37,23};
		
		for(int i=0; i<a.length; i++){
			int sum=0;
			int temp=a[i];
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}

			if(sum<10)
				a[i]*=10;
			else
				a[i]*=100;
			a[i]+=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}
	