// WAP to find Average of Array.

class AvgOfArray
{
	public static void main(String args[])
	{
		int a[]={13,35,23,12,56,99,65,34};
		double avg=0;

		for(int i=0; i<a.length; i++)
			avg+=a[i];
		System.out.println("Sum Of Array = "+(avg));
		System.out.println("Average Of Array = "+(avg/=a.length));
	}
}