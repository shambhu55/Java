// WAP to find sum of array.

class SumOfArray
{
	public static void main(String args[])
	{
		int a[]={10,20,23,45,12,12};
		int sum=0;

		for(int i=0; i<a.length; i++)
			sum+=a[i];
		System.out.println("Sum Of Array = "+sum);
	}
}