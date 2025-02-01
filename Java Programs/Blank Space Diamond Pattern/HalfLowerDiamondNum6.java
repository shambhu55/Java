/*

5       5
45     54
345   543
2345 5432
123454321

*/

class HalfLowerDiamondNum6
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--){
			if(i==1){
				for(int j=1; j<=n; j++)
					System.out.print(j);
				for(int j=n-1; j>=1; j--)
					System.out.print(j);
			}

			else{
				for(int j=i; j<=n; j++)
					System.out.print(j);
				for(int j=1; j<=(i*2)-3; j++)
					System.out.print(" ");
				for(int j=n; j>=i; j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}