/*
Print following Number Pattern

54321
54321
54321
54321
54321

*/


class NumPattern4
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		//for(int i=n; i>=1; i--) we can use this, coz
		{
			for(int j=n; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}