/*

1       1
12     21
123   321
1234 4321
123454321

*/

class HalfLowerDiamondNum3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			if(i==n){
				for(int j=1; j<=n; j++)
					System.out.print(j);
				for(int j=n-1; j>=1; j--)
					System.out.print(j);
			}

			else{
				for(int j=1; j<=i; j++)
					System.out.print(j);
				for(int j=1; j<=((n-i)*2)-1; j++)
					System.out.print(" ");
				for(int j=i; j>=1; j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}