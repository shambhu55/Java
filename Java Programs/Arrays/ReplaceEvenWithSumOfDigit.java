// WAP to replace Even element with their sum digit of element.

class ReplaceEvenWithSumOfDigit
{
	public static void main(String args[])
	{
		int a[]={11,34,56,78,3,34};

		System.out.println("Replaced Array : ");
		for(int i=0; i<a.length; i++){
			if(a[i]%2==0){
				int sum=0;
				int temp=a[i];	//123
				while(temp!=0){
					sum+=temp%10;		
					temp/=10;
				}
				a[i]=sum;
			}
			System.out.println(a[i]);
		}
	}
}