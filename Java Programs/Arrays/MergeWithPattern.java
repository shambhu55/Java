/*
WAP to merge 2 Arrays

input: {10, 20, 30, 40, 50}
       {11, 22, 33, 44, 55, 66, 77}
output: {10, 11, 20, 22, 30, 33, 40, 44, 50, 55, 66, 77}

*/

import java.util.Arrays;
class MergeWithPattern
{
	public static void main(String args[])
	{
		int a[]={10, 20, 30, 40, 50};
		int b[]={11, 22, 33, 44, 55, 66, 77};
		int c[]=new int[a.length+b.length];
                int num=a.length;
		
                if(num<b.length)
		{
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				c[count++]=a[i];
				c[count]=b[i];
				count++;
			}
			for(int i=a.length; i<b.length; i++)
				c[count++]=b[i];
		}
                else
		{
			int count=0;
			for(int i=0; i<b.length; i++)
			{
				c[count++]=a[i];
				c[count]=b[i];
				count++;
			}
			for(int i=b.length; i<a.length; i++)
				c[count++]=a[i];
		}
		System.out.println(Arrays.toString(c));


	}
}