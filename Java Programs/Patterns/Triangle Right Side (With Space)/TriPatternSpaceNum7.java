/*

    1
   12
  123
 1234
12345

*/

class TriPatternSpaceNum7
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}

			for(int j=1; j<=i; j++)		// 
			{
				System.out.print(j);		// prints "j" as not same values in rows 
			}
			System.out.println();
		}
	}
}