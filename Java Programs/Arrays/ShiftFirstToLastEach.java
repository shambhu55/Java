/*
WAP to shift first digit to last from each elements from array.
*/

class ShiftFirstToLastEach
{
	public static void main(String args[])
	{
		int a[]={12, 123, 345, 24};
		for(int i=0; i<a.length; i++){
			int temp=a[i];
			
			int length=1;
			while(temp>=10){
				length*=10;
				temp/=10;
			}
			a[i]=%length;
			a[i]*=10;
			a[i]+=temp;
			System.out.println(a[i]);
		}

	}
}