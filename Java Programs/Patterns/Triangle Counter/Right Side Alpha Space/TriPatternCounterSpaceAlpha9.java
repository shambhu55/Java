/*

    K
   GL
  DHM
 BEIN
ACFJO
				11
			7	12
		4	8	13
	2	5	9	14
1	3	6	10	15

*/

class TriPatternCounterSpaceAlpha9
{
	public static void main(String args[])
	{
		int n=5;		
		int count=((n*(n-1))/2)+1;

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
				c+=j+1;
			}
			System.out.println();
			count-=i-1;
		}
	}
}
