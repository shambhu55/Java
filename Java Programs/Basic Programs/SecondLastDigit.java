/*
WAP to find Second Last Digit of given Number.
Number = 763
*/

class SecondLastDigit
{
	public static void main(String args[])
	{
		int n = 763;
		int q = n / 10;  // 76
		int r = q % 10;  // 6    or We can use "int r = (n/10)%10;" direct.

		System.out.println("Second Last Digit of Given Number is " +r);
	
	}
}