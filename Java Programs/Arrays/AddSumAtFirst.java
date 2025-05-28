/*
WAP to add sum at the First of elements from array.

*/

import java.util.Arrays;
class AddSumAtFirst
{
	public static void main(String args[])
	{
		int a[]={1,37,234};
		for(int i=0; i<a.length; i++){
			int sum=0;
			int temp=a[i];
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}

			int store=a[i];
			int addzero=1;
			while(store>0){
				store/=10;
				addzero*=10;
			}
			a[i]+=(sum*addzero);
		}
		System.out.println(Arrays.toString(a));
	}
}
	





/*

			if(a[i]<10)
				sum*=10;
			else if(a[i]>=10 && a[i]<100)
				sum*=100;
			else
				sum*=1000;

*/









