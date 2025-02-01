/*

5       5
54     45
543   345
5432 2345
543212345

*/

class HalfLowerDiamondNum5
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--){
			if(i==1){
				for(int j=n; j>=1; j--)
					System.out.print(j);
				for(int j=2; j<=n; j++)
					System.out.print(j);
			}

			else{
				for(int j=n; j>=i; j--)
					System.out.print(j);
				for(int j=1; j<=(i*2)-3; j++)
					System.out.print(" ");
				for(int j=i; j<=n; j++)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}