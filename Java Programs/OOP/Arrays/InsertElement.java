/*
W3 RESOURCE : ARRAY
9. Write a Java program to insert an element (specific position) into an array.
And take array from user.

i/p : {2,3,4,5,11,22,33}
o/p :  	a[4] = 12
	{2,3,4,5,12,11,22,33}
*/

import java.util.Arrays;
import java.util.Scanner;
class InsertElement
{
	public static void main(String args[])
	{
	// Size of Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array (min size 4) : ");
		int size = sc.nextInt();

	// create and inser elements into array by user
		int a[] = new int [size];
		System.out.print("Enter Array Elements :");
		for(int i=0; i<a.length; i++)
			a[i]= sc.nextInt();
		System.out.println(Arrays.toString(a));


	//create new array for inserted element's array.
		int b[] = new int[a.length+1];
		System.out.println(Arrays.toString(b));

	// Creating New array with inserted element.
		for(int i=0; i<a.length; i++)
		{
			if(i==4)	
				b[i]=12;
			else
				b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}