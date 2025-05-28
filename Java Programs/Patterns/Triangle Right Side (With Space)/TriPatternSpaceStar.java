/*

    *
   **
  ***
 ****
*****

*/

class TriPatternSpaceStar
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)		// This loop for Rows.
		{
			for(int j=i; j<n; j++)		//This loop for Space
			{
				System.out.print(" ");
			}

			for(int j=i; j>=1; j--)		// This loop for Stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}