/*

WAP to find sum of 2 elements from array.
input : {10,20,30,40,50,60,70,80,90}
output: key=70
10      80
20      70
30      60
40      50

*/

class SumOf2Elements
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50,60,70,80,90};
		int key=90;

		for(int i=0; i<a.length-2; i++)
			for(int j=i+1; j<a.length-1; j++)
				if(a[i]+a[j]==key)
					System.out.println(a[i]+"\t"+a[j]);
	}
}