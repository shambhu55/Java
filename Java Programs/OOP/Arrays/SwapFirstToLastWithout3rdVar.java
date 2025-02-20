/*
 WAP to swap first and last element from array wirhout using 3rd variable.
Input : {10,20,30,40,50}
Output : {50,20,30,40,10}

*/

import java.util.Arrays;
class SwapFirstToLastWithout3rdVar
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};

		a[0]=a[0]+a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]=a[0]-a[a.length-1];
	
		System.out.println(Arrays.toString(a));

	}
}