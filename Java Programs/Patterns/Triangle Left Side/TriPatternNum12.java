/*

54321
5432
543
54
5

*/

class TriPatternNum12
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}