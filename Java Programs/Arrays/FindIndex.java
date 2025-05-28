/*

W3 RESOURCE : ARRAY
6. Write a Java program to find the index of an array element.
Input : {10,20,30,45,66,23,56,77}
Output : n=66
	 :4
*/

import java.util.Arrays;
class FindIndex
{
	public static void main(String args[])
	{
		int a[]={10,20,30,45,66,23,56,77};
		int n=66;

		for(int i=0; i<a.length; i++)
			if(a[i]==n)
				System.out.println(n+"'s index : "+i);
	}
}
