/*

WAP to reverse of each elements from array.
input : {12,34,56,23,24,46};
output : [21, 43, 65, 32, 42, 64]

*/

import java.util.Arrays;
class ReverseEachElement
{
	public static void main(String args[])
	{
		int a[]={12,34,56,23,24,46};

		for(int i=0; i<a.length; i++){
			int temp=a[i];
			int sum=0;
			while(temp!=0){			
				sum*=10;	
				sum+=temp%10;		
				temp/=10;	
			}
			a[i]=sum;
			
		}
		System.out.println(Arrays.toString(a));
	}
}