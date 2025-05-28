/*

ABCDE
ABCD
ABC
AB
A

22

*/

class TriPatternAlpha6
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		// i=3 >=1
		{
			for(int j=1; j<=i; j++)		//j=1,2,3 <=
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}
