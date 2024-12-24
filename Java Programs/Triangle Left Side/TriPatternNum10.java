/*
Print following Triangular Numeric Pattern.

5
54
543
5432
54321

*/

class TriPatternNum10
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		//i=0 0>=1
		{
			for(int j=n; j>=i; j--)		//j=5 5>=3
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
