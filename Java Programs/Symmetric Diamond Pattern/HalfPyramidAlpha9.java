/*

AbCdEdCbA
 AbCdCbA
  AbCbA
   AbA
    A
*/

class HalfPyramidAlpha9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j<n; j++)
				System.out.print(" ");

			for(int j=1; j<=i; j++)
				System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));

			for(int j=i-1; j>=1; j--)
				System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));

			System.out.println();
		}
	}
}