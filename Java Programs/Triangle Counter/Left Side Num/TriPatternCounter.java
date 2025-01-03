/*

1
2	3
4	5	6
7	8	9	10
11	12	13	14	15

*/

class TriPatternCounter
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;	//4
		for(int i=1; i<=n; i++)	//i=2 <=5
		{
			for(int j=i; j>=1; j--)	//j=1 >=1
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
	}
}
