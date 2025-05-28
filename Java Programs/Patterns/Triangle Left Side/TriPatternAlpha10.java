/*

EDCBA
EDCB
EDC
ED
E
23

*/

class TriPatternAlpha10
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		//i=3 <=5
		{
			for(int j=n; j>=i; j--)		// j=5,4,3	>=3  543
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}