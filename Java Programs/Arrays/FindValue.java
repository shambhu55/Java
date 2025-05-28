/*

W3 RESOURCE : ARRAY
5. Write a Java program to test if an array contains a specific value.

*/

import java.util.Arrays;
class FindValue
{
	public static void main(String args[])
	{
		int a[]={10,20,30,45,66,23,56,77};
		int value=66;

		for(int i=0; i<a.length; i++)
			if(a[i]==value)
				System.out.println("Value Found at "+i+"th position : "+a[i]);
	}
}