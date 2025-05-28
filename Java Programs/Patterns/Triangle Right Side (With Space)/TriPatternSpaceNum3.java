/*

12345
 1234
  123
   12
    1

*/

class TriPatternSpaceNum3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		//i=4 >=1
		{
			for(int j=i; j<n; j++)		//j=4 <5
			{
				System.out.print(" ");
			}

			for(int j=1; j<=i; j++)
			{
				System.out.print(j);		// j=1,2,3,4 <=4
			}
			System.out.println();
		}
	}
}

