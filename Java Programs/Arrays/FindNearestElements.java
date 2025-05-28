/*
WAP to find nearest element from array.
input : {12,14,18,13,17,20,24,28,21}
output : 12 13
	 13 14
	 14 15
	 17 18
	 20 21
*/

import java.util.Arrays;
class FindNearestElements
{
	public static void main(String args[])
	{
		int a[] = {12,14,18,13,17,20,24,28,21};
		
		int min=0;
		int min2=28;
		int new_diff;

		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				min=Math.abs(a[i]-a[j]);
				if(min<min2)
					min2=min;

				new_diff=Math.abs(a[i]-a[j]);
				if(new_diff==min2 && new_diff!=0)
					System.out.println(a[i]+"\t"+a[j]);
			}
		}
	}
}



/*
		int a[]={10,20,30,40,90,15,50};
		int max=0;
		int smax=0;

		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max){		
				smax=max;
				max=a[i];	
			}
			else
				if(a[i]>smax && a[i]!=max)	
					smax=a[i];
		}

*/