/*

54321
4321
321
21
1

*/

class TriPatternNum11
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		//i=4 4>=1
		{
			for(int j=i; j>=1; j--)		//j=4 4>=1
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
