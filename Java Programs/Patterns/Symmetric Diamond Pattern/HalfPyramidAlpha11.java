/*

EdCbAbCdE
 EdCbCdE
  EdCdE
   EdE
    E

*/

class HalfPyramidAlpha11
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>1; j--)
				System.out.print(" ");

			for(int j=n; j>=i; j--)
				System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));

			for(int j=i+1; j<=n; j++)
				System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));

			System.out.println();
		}
	}
}