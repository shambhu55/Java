/*

WAP to Find Simple Interest.
Ammount = 10000, 
Rate of Interest = 3%(per year), 
No. of Year = 27 year.  

*/

class SimpleInterest
{
	public static void main(String args[])
	{
		int a = 10000;
		int r = 3;
		int y = 27;
		int SI = (a*r*y)/100;

		System.out.println("Simple Interest is " +SI);
	}
}