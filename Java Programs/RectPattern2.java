/*
Print 3*3 rectangular pattern.
***     ***     ***     ***
***     ***     ***     ***
***     ***     ***     ***


*/


class RectPattern2
{
	public static void main(String args[])
	{
		for(int k=1; k<=3; k++)
		{
			for(int i=1; i<=3; i++)
			{
		  		System.out.print("*");	
			}
			System.out.print(" ");


			for(int l=1; l<=3; l++)
			{
		  		System.out.print("*");	
			}
			System.out.print(" ");


			for(int m=1; m<=3; m++)
			{
		  		System.out.print("*");	
			}
			System.out.print(" ");


			for(int j=1; j<=3; j++)
			{
		  		System.out.print("*");
			}
			System.out.println();
		
		}

	}
}

