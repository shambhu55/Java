/*

Print 10 multiples of 10 and 5 in reverse as follow

10 x 1 = 10     5 x 10 = 50
10 x 2 = 20     5 x 9 = 45
10 x 3 = 30     5 x 8 = 40
10 x 4 = 40     5 x 7 = 35
10 x 5 = 50     5 x 6 = 30
10 x 6 = 60     5 x 5 = 25
10 x 7 = 70     5 x 4 = 20
10 x 8 = 80     5 x 3 = 15
10 x 9 = 90     5 x 2 = 10
10 x 10 = 100   5 x 1 = 5

*/



class Multiples2
{
	public static void main(String args[])
	{
		for(int i=1, j=10; i<=10 || j>=1; i++,j--)
		{
			System.out.print("10 x "+i +" = " +(10*i));
			System.out.print("\t");
			System.out.print("5 x "+j +" = " +(5*j));
			System.out.println("\t");
		}

	}
}