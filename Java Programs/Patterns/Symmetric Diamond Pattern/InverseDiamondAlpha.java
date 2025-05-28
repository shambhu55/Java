/*

AAAAAAAAA
 bbbbbbb
  CCCCC
   ddd
    E
   ddd
  CCCCC
 bbbbbbb
AAAAAAAAA

*/

class InverseDiamondAlpha
{
	public static void main(String args[])
	{
		int n=5;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>1; j--)
				System.out.print(" ");

			for(int j=i; j<=(n*2)-i; j++)
				System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));

			System.out.println();
		}

		for(int i=n-1; i>=1; i--)
		{
			for(int j=i; j>1; j--)
				System.out.print(" ");

			for(int j=1; j<=((n-i+1)*2)-1; j++)
				System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));

			System.out.println();

		}
	}
}