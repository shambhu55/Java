/*

e
dd
ccc
bbbb
aaaaa

*/

class TriPatternAlpha3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		//i=3 3>=1
		{
			for(int j=i; j<=n; j++)		//j=3 3<=5
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
		}
	}
}