/*

WAP to find max element from array.

*/

import java.util.Arrays;
class FindMax
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,90,15};
		int max=a[0];
		for(int i=0; i<a.length; i++){
			
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Max = "+max);
	}
}
