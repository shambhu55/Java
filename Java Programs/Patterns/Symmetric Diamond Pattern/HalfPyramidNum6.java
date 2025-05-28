/*

    5
   454
  34543
 2345432
123454321

*/

class HalfPyramidNum6
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>1; j--)
				System.out.print(" ");

			for(int j=i; j<=n; j++)
				System.out.print(j);

			for(int j=n-1; j>=i; j--)
				System.out.print(j);

			System.out.println();
		}
	}
}