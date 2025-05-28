/*
Create Array According To user.
*/

import java.util.Scanner;
import java.util.Arrays;

class CreateArrayByUser
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		// scanner requires input

		System.out.print("Enter Size of Array : ")	// to display for user.
		int size = sc.nextInt();			// to take size of array from user. 

		int a[] = new int[size];			// create array by size given by user.
		for(int i=0; i<a.length; i++)			// to repeat size th times
			a[i]=sc.nextInt();			// to take value from user
		System.out.print(Arrays.toString(a));
	}
}