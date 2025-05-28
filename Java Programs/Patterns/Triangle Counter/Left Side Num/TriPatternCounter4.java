/*

15
13	14
10	11	12
6	7	8	9
1	2	3	4	5

*/

class TriPatternCounter4
{
	public static void main(String args[])
	{
		int n=5;		
		int count = (n*(n+1))/2;		//int count=15; 15,13,10,6

		for(int i=1; i<=n; i++)			//i=3 <=5
		{
			int c=count;			// 12
			for(int j=i; j>=1; j--)		//j=3,2,1, 0 >=1 
			{
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			count = count - i-1;		//=10-3-1=6
		}
	}
}

