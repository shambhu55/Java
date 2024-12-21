/*

    1
   21
  321
 4321
54321

----1
---21
--321
-4321
54321

*/

class TriPatternSpaceNum4
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		//i=1,2 <=5
		{
			for(int j=i; j<n; j++)		//j=2 <5
			{
				System.out.print(" ");
			}

			for(int j=i; j>=1; j--)		//j=2 >=1
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}