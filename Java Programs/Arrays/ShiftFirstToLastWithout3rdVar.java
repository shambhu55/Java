/*

 WAP to Shift first and last element from array without 3rd variable.
Input : {10,20,30,40,50}
Output : {20,30,40,50,10}

*/

import java.util.Arrays;
class ShiftFirstToLastWithout3rdVar
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,33,55,66};

		for(int i=0; i<a.length-1; i++){
			a[i]=a[i]+a[i+1];
			a[i+1]=a[i]-a[i+1];
			a[i]=a[i]-a[i+1];
		}
		System.out.println(Arrays.toString(a));
	}
}
