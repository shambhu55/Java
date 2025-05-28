/*
WAP to shift First character of String at the end of String.
i/p : "India"
o/p : "ndiaI"
THIS PROBLE IS SOLVED USING 4 TYPES.
*/


// TYPE 4 : Using StringBuilder
// Creates 2 object without loop.

class ShiftFirstToEnd
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1.substring(1));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}
}




/*
// TYPE 3 : Using StringBuilder
// Creates 3 object without loop.

class ShiftFirstToEnd
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1.substring(1));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}
}
*/



/*
// TYPE 2 : Using StringBuilder
// Create 3 Objects with loops and Iterate loop according to length of String.
class ShiftFirstToEnd
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder();

		for(int i=1; i<s1.length(); i++)
			sb.append(s1.charAt(i));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}		
}
*/




/*
// TYPE 1 : Using loop.
// Dont prefer this method, coz it creates extra objects unnecessary.
class ShiftFirstToEnd
{
	public static void main(String args[])
	{
		String s1 = "India";
		String s2 = "";

		for(int i=1; i<s1.length(); i++)
		{
			s2+=s1.charAt(i);
		}
		s2+=s1.charAt(0);
		System.out.println(s2);
	}
}
*/

























