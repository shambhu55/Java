/*
 WAP to swap first and last element from array.
Input : {10,20,30,40,50}
Output : {50,20,30,40,10}
*/

import java.util.Arrays;
class SwapFirstToLast
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};

		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
	
		System.out.println(Arrays.toString(a));

	}
}