/*

WAP to find second max element from array.

*/

import java.util.Arrays;
class FindSecondMax
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,90,15,50};
		int max=0;	// 10 20 30 40 90
		int smax=0;	// 0 10 20 30 40

		for(int i=0; i<a.length; i++) //0 1 2 3 4 5 6
		{
			if(a[i]>max){		//10>0, 20>10, 30>20, 40>30, 90>40, 15>90F, 50>90F
				smax=max;	//0 10 20 30 40
				max=a[i];	//10 20 30 40 90
			}
			else
				if(a[i]>smax && a[i]!=max)	// 15>40F, 50>40 && 50!=90
					smax=a[i];		// 50
		}
		System.out.println("max : "+max);
		System.out.println("smax : "+smax);
	}
}	