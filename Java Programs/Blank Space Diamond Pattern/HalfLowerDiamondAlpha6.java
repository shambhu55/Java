/*

E       E
dE     Ed
CdE   EdC
bCdE EdCb
AbCdEdCbA

*/

class HalfLowerDiamondAlpha6
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--){
			if(i==1){
				for(int j=1; j<=n; j++)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
				for(int j=n-1; j>=i; j--)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
			}

			else{
				for(int j=i; j<=n; j++)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
				for(int j=1; j<=(i*2)-3; j++)
					System.out.print(" ");
				for(int j=n; j>=i; j--)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
			}
			System.out.println();
		}
	}
}
