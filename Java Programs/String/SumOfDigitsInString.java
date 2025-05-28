package String;
/*
WAP to count Sum of Digits in the String.
i/p : welcome to 2025
o/p : 9
*/

class SumOfDigitsInString
{
	public static void main(String args[])
	{
		String s1 = "wlcome to 2025";
		int sum = 0;

		for(int i=0; i<s1.length(); i++)
			if(Character.isDigit(s1.charAt(i)))
				sum+=Character.getNumericValue(s1.charAt(i));
		System.out.println(sum);
	}	
}




