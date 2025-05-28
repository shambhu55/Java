/*

111111111
 2222222
  33333
   444
    5

*/

class HalfPyramidNum7
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>1; j--)
				System.out.print(" ");

			for(int j=1; j<=((n-i+1)*2)-1; j++)	//for(int j=i; j<=(n*2)-i; j++)
				System.out.print(i);

			System.out.println();
		}
	}
}