/*
Print following Numeric triangular pattern.

1
22
333
4444
55555

*/

class TriPatternNum
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}