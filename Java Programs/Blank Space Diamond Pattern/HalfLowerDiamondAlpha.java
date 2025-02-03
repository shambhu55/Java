/*

A       A
bb     bb
CCC   CCC
dddd dddd
EEEEEEEEE

*/

class HalfLowerDiamondAlpha
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++){
			if(i==n){
				for(int j=1; j<=(n*2)-1; j++)
					System.out.print((i%2!=0)?(char)(i+64):(char)(i+96));
			}

			else{
				for(int j=1; j<=i; j++)
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