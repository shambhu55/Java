package String;
/*
i/p : never odd or even
o/p : Palindrome String.
*/

class IsPalindromeString
{
	public static void main(String args[])
	{
		String s1 = "never odd or even";
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s1.length(); i++)
		{
			if(Character.isLetterOrDigit(s1.charAt(i)))
				sb.append(s1.charAt(i));

			if(sb.toString().equalsIgnoreCase(sb.reverse().toString()))
				System.out.println("Palindrome String!");
		}
	}
}