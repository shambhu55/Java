/*

    A
   BB
  CCC
 DDDD
EEEEE

*/

class TriPatternSpaceAlpha4
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}

			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}