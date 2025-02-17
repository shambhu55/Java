// WAP to replace odd element with their first digit of element.

class ReplaceOddWithFirstDigit
{
	public static void main(String args[])
	{
		int a[]={12,23,34,45,56,22,33,11};

		System.out.println("Replaced Array : ");
		for(int i=0; i<a.length; i++){
			if(a[i]%2!=0){

				int temp=a[i];
				while(temp>10)
					temp/=10;
				a[i]=temp%10;
			}
			System.out.println((a[i]));
		}
	}
}