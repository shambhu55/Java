/*
W3 RESOURCE : ARRAY
10. Write a Java program to find the maximum and minimum value of an array.
And take array from user.

i/p : {2,3,4,5,11,22,33}
o/p : 	Max : 33
	Min : 2
*/

import java.util.Scanner;
import java.util.Arrays;
class FindMaxMin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();

		int a[] = new int[size];
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();

		Arrays.sort(a);
		System.out.println("Max : "+a[a.length-1]);
		System.out.println("Min : "+a[0]);

	}
}