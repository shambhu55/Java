/*
Print following Number Pattern

55555
44444
33333
22222
11111

*/


class NumPattern2
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}