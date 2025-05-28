/*

a
ba
cba
dcba
edcba

10

*/

class TriPatternAlpha7
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		// i=1,2,3 <=5
		{
			for(int j=i; j>=1; j--)		//j=3,2,1 >=1
			{
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
}




