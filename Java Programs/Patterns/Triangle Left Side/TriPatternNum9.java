/*

12345
2345
345
45
5

*/

class TriPatternNum9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		//i=5, 5<=5
		{
			for(int j=i; j<=n; j++)		//j=5, 5<=5
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

