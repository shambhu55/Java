package String;
/*
WAP to swap First and Last characters of String.
i/p : "India"
o/p : "andiI"

*/


class SwapFirstAndLAst
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder();
		
		sb.append(s1.charAt(s1.length()-1));
		sb.append(s1.substring(1, s1.length()-1));	// for this part we can use loop also.
		sb.append(s1.charAt(0));

		System.out.println(sb);
	}
}




/*
class SwapFirstAndLAst
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1);

		char c = sb.charAt(sb.length()-1);
		sb.insert(0, c);
		sb.deleteCharAt(sb.length()-1);
		sb.append(c);

		c = sb.charAt(1);
		sb.deleteCharAt(sb.length()-1);
		sb.append(c);

		System.out.println(sb);
	}
}

*/




