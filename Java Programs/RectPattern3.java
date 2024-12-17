/*
Print (3*3)*(3*3) rectangular pattern.

***     ***     ***
***     ***     ***
***     ***     ***

***     ***     ***
***     ***     ***
***     ***     ***


***     ***     ***
***     ***     ***
***     ***     ***


*/

class RectPattern3
{
	public static void main(String args[])
	{
		for(int k=1; k<=3; k++)
		{
			for(int l=1; l<=3; l++)
			{
				for(int i=1; i<=3; i++)
				{
					for(int j=1; j<=3; j++)
					{
						System.out.print("*");
					}
					System.out.print(" ");	
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
}










