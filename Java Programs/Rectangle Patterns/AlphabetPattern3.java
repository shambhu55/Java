/* Print following alphabet pattern

abcde
abcde
abcde
abcde
abcde

*/


class AlphabetPattern3
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}