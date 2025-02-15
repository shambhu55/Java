// WAP to Display greater element than average of array.

class GreaterThanAvg
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		double avg=0;

		for(int i=0; i<a.length; i++)
			avg+=a[i];
		System.out.println("Average = "+(avg/=a.length));

		System.out.println("Greater element than average : ");

		for(int i=0; i<a.length; i++)
			if(a[i]>avg)
				System.out.println(a[i]);
	}
}