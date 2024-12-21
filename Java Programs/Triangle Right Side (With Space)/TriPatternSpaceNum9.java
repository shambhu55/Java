/*

    5
   54
  543
 5432
54321


*/

class TriPatternSpaceNum9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)		//i=3 >=1
		{
			for(int j=i; j>1; j--)		//j=3,2 >1
			{
				System.out.print(" ");
			}

			for(int j=n; j>=i; j--)		//j=5, 4, 3 , 2>=3
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}