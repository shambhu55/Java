/*

    A
   bbb
  CCCCC
 ddddddd
EEEEEEEEE

*/

class HalfPyramidAlpha
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
				System.out.print(" ");

			for(int j=1; j<=(i*2)-1; j++)
				if(i%2!=0)
					System.out.print((char)(i+64));
				else
					System.out.print((char)(i+96));

				//OR System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));

			System.out.println();
		}
	}
}