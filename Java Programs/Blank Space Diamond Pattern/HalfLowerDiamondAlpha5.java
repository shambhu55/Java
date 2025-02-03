/*

E       E
Ed     dE
EdC   CdE
EdCb bCdE
EdCbAbCdE

*/

class HalfLowerDiamondAlpha5
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--){
			if(i==1){
				for(int j=n; j>=1; j--)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
				for(int j=2; j<=n; j++)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
			}

			else{
				for(int j=n; j>=i; j--)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
				for(int j=1; j<=(i*2)-3; j++)
					System.out.print(" ");
				for(int j=i; j<=n; j++)
					System.out.print((j%2!=0)?(char)(j+64):(char)(j+96));
			}
			System.out.println();
		}
	}
}