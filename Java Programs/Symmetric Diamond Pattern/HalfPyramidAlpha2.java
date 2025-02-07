/*

    E
   ddd
  CCCCC
 bbbbbbb
AAAAAAAAA

*/

class HalfPyramidAlpha2
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>1; j--)
				System.out.print(" ");

			for(int j=1; j<=((n-i+1)*2)-1; j++)
				System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));

			System.out.println();
		}
	}
}