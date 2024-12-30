/*

E
ED
EDC
EDCB
EDCBA
11

*/

class TriPatternAlpha8
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		// i=1 >=1
		{
			for(int j=n; j>=i; j--)		// j=43210 >=1
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}