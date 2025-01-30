/*

A       A
bb     bb
CCC   CCC
dddd dddd
EEEEEEEEE
dddd dddd
CCC   CCC
bb     bb
A       A

*/

class SpaceDiamondAlpha
{
	public static void main(String args[])
	{
		int n=5;

		for(int i=1; i<=n; i++)
		{
			if(i==n){
				for(int j=n; j>=1; j--)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
				for(int j=n-1; j>=1; j--)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));

			}

			else
			{
				for(int j=i; j>=1; j--)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
				for(int j=1; j<=((n-i)*2)-1; j++)
					System.out.print(" ");
				for(int j=1; j<=i; j++)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
			}
			System.out.println();
		}

		for(int i=n-1; i>=1; i--)
		{
			if(i==n){
				for(int j=n; j>=1; j--)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
				for(int j=i+1; j<=n; j++)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
			}

			else
			{
				for(int j=i; j>=1; j--)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
				for(int j=1; j<=((n-i)*2)-1; j++)
					System.out.print(" ");
				for(int j=1; j<=i; j++)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
			}
			System.out.println();
		}
	}
}