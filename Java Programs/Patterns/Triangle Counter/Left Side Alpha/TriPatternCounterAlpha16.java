/*
ONLIE
MKHD
JGC
FB
A

15	14	12	9	5
13	11	8	4
10	7	3
6	2
1
*/

class TriPatternCounterAlpha16
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1)/2);

		for(int i=1; i<=n; i++)
		{
			int c=count;
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count-=i+1;
		}
	}
}
