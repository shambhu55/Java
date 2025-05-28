/*

15
14	10
13	9	6
12	8	5	3
11	7	4	2	1

*/

class TriPatternCounter7
{
	public static void main(String args[])
	{
		int n=5;		
		int count=(n*(n+1)/2);	//13

		for(int i=n; i>=1; i--)	//i=3 >=1
		{
			int c=count;	//c=13
			for(int j=n; j>=i; j--)	//j=5 >=3
			{
				System.out.print(c+"\t");
				c-=j-1;	//13-(5-1)=9
			}
			System.out.println();
			count--;
		}
	}
}


