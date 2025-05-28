/*

OA      NF      LJ      IM      EO
        MB      KG      HK      DN
                JC      GH      CL
                        FD      BI
                                AE


15	14	12	9	5
	13	11	8	4
		10	7	3
			6	2
				1

1	6	10	13	15
	2	7	11	14
		3	8	12
			4	9
				5



*/

class TriPatternDoubleCounter7
{
	public static void main(String args[])
	{
		int n=5;		
		int count1=n*(n+1)/2;
		int count2=1;
		
		for(int i1=1; i1<=n; i1++)
		{
			int c1 = count1;
			int c2 = count2;

			for(int j1=i1; j1>1; j1--)
			{
				System.out.print("\t");
			}

			for(int j1=i1, j2=n; j1<=n || j2>i1; j1++, j2--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64));
				System.out.print("\t");
				c1-=j1;
				c2+=j2;
			}
			System.out.println();
			count1-=i1+1;
			count2++;
		}
	}
}
