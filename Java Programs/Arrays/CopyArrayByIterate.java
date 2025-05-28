/*

W3 RESOURCE : ARRAY
8. Write a Java program to copy an array by iterating the array.
Input : {10,20,30,45,66,23,56,77}
Output : {10,20,30,45,66,23,56,77}

*/

import java.util.Arrays;
class CopyArrayByIterate
{
	public static void main(String args[])
	{
		int a[]={10,20,30,45,66,23,56,77};
		int b[]=new int [a.length];
		for(int i=0; i<a.length; i++)
			b[i]=a[i];
		
		System.out.println("a[] : "+Arrays.toString(a));
		System.out.println("b[] : "+Arrays.toString(b));
		System.out.println(a==b);	//False, Both Memory have Different Memory.
	}
}
