/*

1
3	2
6	5	4
10	9	8	7
15	14	13	12	11

*/

class TriPatternCounter3
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1; i<=n; i++)
		{
			int c = count;
			for(int j=i; j>=1; j--)
			{
				System.out.print(c+"\t");
				c--;
			}
			System.out.println();
			count+=i+1;		//count=count+i+1; The gap between 2 cons rows is 2-4-5 i.e first number of row is 1-3(1+ 1+1)-6(3+ 2+1)-10(6+ 3+1)-15(10+ 4+1) count+row_num+1
		}
	}
}
