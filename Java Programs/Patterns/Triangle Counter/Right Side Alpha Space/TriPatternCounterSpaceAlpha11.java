/*
    E
   ID
  LHC
 NKGB
OMJFA

				5
			9	4
		12	8	3
	14	11	7	2
15	13	10	6	1

*/

class TriPatternCounterSpaceAlpha11
{
	public static void main(String args[])
	{
		int n=5;		
		int count=n;

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
				c-=j+1;
			}
			System.out.println();
			count+=i-1;
		}
	}
}
