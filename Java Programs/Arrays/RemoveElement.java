/*

W3 RESOURCE : ARRAY
7. Write a Java program to remove a specific element from an array.
Input : {10,20,30,45,66,23,56,77}
Output : n=66
	: {10,20,30,45,23,56,77}
*/

import java.util.Arrays;
class RemoveElement
{
	public static void main(String args[])
	{
		int a[]={10,20,30,45,66,23,56,77};
		int b[]=new int[a.length-1];
		int n=66, count=0;

		for(int i=0; i<a.length; i++)
			if(a[i]!=n)
				b[count++]=a[i];
		System.out.println(Arrays.toString(b));
	}
}