/*

A
AB
ABC
ABCD
ABCDE
10

*/

class TriPatternAlpha5
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		//3<=5
		{
			for(int j=1; j<=i; j++)		//j=1,2,3 <=3
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}