/*

A
BB
CCC
DDDD
EEEEE

*/

class TriPatternAlpha
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		//i=4 3<=5
		{
			for(int j=1; j<=i; j++)		//j=1 3<=4
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}
	}
}

