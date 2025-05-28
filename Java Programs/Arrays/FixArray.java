/*
WAP to fix Array.
{5,4,1,2}
:3

{6,1,4,2,2}
:4

{19,10,1}
:9

{5,7,2}
:-1

{4,4,4}
:0

*/

import java.util.Arrays;
class FixArray
{
	public static void main(String args[])
	{
		int a[] = {6,1,4,2,2};

	//Find Averagessss
		double avg=0;
		for(int i=0; i<a.length; i++)
			avg+=a[i];
		avg/=a.length;
		System.out.println(avg);

	//check Decimal or not
		int count=0;
		double temp = (Math.floor(avg));
		if(avg-temp==0)
		{
			for(int i=0; i<a.length; i++)
				if(a[i]<avg)
					count+=avg-a[i];
			System.out.println(count);
		}
		else
			System.out.println(-1);
	}
}

