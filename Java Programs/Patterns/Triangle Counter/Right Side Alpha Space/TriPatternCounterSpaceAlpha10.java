/*
    O
   JN
  FIM
 CEHL
ABDGK

				15
			10	14
		6	9	13
	3	5	8	12
1	2	4	7	11

*/

class TriPatternCounterSpaceAlpha10
{
	public static void main(String args[])
	{
		int n=5;		
		int count=(n*(n+1))/2;

		for(int i=n; i>=1; i--)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count-=i;
		}
	}
}
