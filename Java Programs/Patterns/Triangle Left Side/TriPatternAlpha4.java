/*

eeeee
dddd
ccc
bb
a
21

*/

class TriPatternAlpha4
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		//i=1 1>=1
		{
			for(int j=1; j<=i; j++)		// j=1 1<=1
			{
				System.out.print((char)(96+i));
			}
			System.out.println();
		}
	}
}
