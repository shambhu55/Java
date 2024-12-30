/*

e
de
cde
bcde
abcde
12

*/

class TriPatternAlpha9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
}