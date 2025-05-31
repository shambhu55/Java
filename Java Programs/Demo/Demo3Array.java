/*
Take array from user and Find Second Largest Element in an Array.
i/p : [22,11,23,45,65,34,33]
o/p : 45
Steps:
- take array from user
- initialize max and second max
- compare max with each element
- if max found, replace max wirh new and second max with max.

import java.util.Scanner;
class Demo3Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Engter size of Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();
		System.out.println(java.util.Arrays.toString(a));

		int max=0;
		int secmax=0;
		for(int i=0; i<a.length; i++){
			if(a[i]>max){
				secmax=max;
				max=a[i];
			}
			else
				if(a[i]>secmax && a[i]!=max)
					secmax=a[i];
		}
		System.out.println("Max : "+max);
		System.out.println("Second max : "+secmax);
	}
}
*/



/*
Take array from user and Find Third Largest Element in an Array.
i/p : [22,11,23,45,65,34,33]
o/p : 34
Steps:
- take array from user
- initialize 3 variables as max, smax and tmax with least number(0)
- 1. compare for max, if max found, replace tmax with smax, smax with max, max with element.
- 2. first false, it checks for second, if found, tmax with smax and smax with element as its not max
- 3. second false, it checks for third max, if found, it replace with tmax, as its not max and smax.


import java.util.Scanner;
class Demo3Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();
		System.out.println(java.util.Arrays.toString(a));

		int max=0;
		int smax=0;
		int tmax=0;
		for(int i=0; i<a.length-1; i++){
			if(a[i]>max){
				tmax=smax;
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max){
				tmax=smax;
				smax=max;
			}
			else if(a[i]>tmax && a[i]!=smax && a[i]!=max){
				tmax = a[i];
			}
		}
		System.out.println("max:"+max);
		System.out.println("smax:"+smax);
		System.out.println("tmax:"+tmax);
	}

	
}
*/


/*
//7. Write a Java program to remove a specific element from an array.

class Demo3Array
{
	public static void main(String[] args)
	{
		int a[] = {10,20,30,40,50};
		int key = 30;
		int b[] = new int[a.length-1];
		int count = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=key)
			{
				b[count]=a[i];
				count++;
			}
		}
		System.out.println(java.util.Arrays.toString(b));
	}
}
*/

