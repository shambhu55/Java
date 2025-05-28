/*
W3 RESOURCE : ARRAY
12. Write a Java program to find duplicate values in an array of integer values.
And take array from user.

i/p : {2,3,4,5,11,22,33,2}
o/p : Duplicate - 2
*/

import java.util.Scanner;
import java.util.Arrays;
class DuplicateElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

	// Array creation By user
		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();
		System.out.println(Arrays.toString(a));

	// Array sort to calculate adjacent element Difference
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

	// To find Duplicate.
		System.out.println("Duplicate Elements : ");
		for(int i=0; i<a.length-1; i++)
			if(Math.abs(a[i]-a[i+1])==0)
				System.out.println(a[i]);
		
		
	}
}