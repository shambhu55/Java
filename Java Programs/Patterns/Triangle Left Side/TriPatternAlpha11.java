/*

edcba
dcba
cba
ba
a
24

*/

class TriPatternAlpha11
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
}