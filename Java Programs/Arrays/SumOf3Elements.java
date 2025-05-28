/*
WAP to find sum of 3 elements from array.
input : {10,20,30,40,50,60,70,80,90}
output: key=90
10      20      60
10      30      50
20      30      40

*/

class SumOf3Elements
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50,60,70,80,90};
		int key=90;

		for(int i=0; i<a.length-3; i++)
			for(int j=i+1; j<a.length-2; j++)
				for(int k=j+1; k<a.length-1; k++)
				if(a[i]+a[j]+a[k]==key)
					System.out.println(a[i]+"\t"+a[j]+"\t"+a[k]);
	}
}