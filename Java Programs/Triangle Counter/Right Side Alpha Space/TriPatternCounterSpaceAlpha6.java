/*
    E
   DI
  CHL
 BGKN
AFJMO

				5
			4	9
		3	8	12
	2	7	11	14
1	6	10	13	15

*/

class TriPatternCounterSpaceAlpha6
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
			
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count--;
		}
	}
}
