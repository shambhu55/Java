// WAP to find avg of Odd elements from array.

class AvgOfOddElements
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		double avg=0;
		int count=0;

		for(int i=0; i<a.length; i++)
			if(a[i]%2!=0){
				count++;
				avg+=a[i];
			}

		System.out.println("Sum Of Odd Elements in Array = "+(avg));
		System.out.println("Average Of Odd Elements in Array = "+(avg/=count));
	}
}