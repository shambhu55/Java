/*
Print following Number Pattern

12345
12345
12345
12345
12345

*/


class NumPattern3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		//for(int i=n; i>=1; i--) we can use this, coz
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}