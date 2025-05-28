/*
WAP to shift Last character of String at the First of String.
i/p : "India"
o/p : "aIndi"
THIS PROBLE IS SOLVED USING 4 TYPES(Not using 1st one).
*/


//Type 2
class ShiftLastToFirst
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1.substring(s1.length()-1));
		
		for(int i=0; i<s1.length()-1; i++)
			sb.append(s1.charAt(i));
		System.out.println(sb);
	}	
}


/*
class ShiftLastToFirst
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1);
		char c = s1.charAt(s1.length()-1); //c=a
		sb.deleteCharAt(s1.length()-1);
		c.append(sb);
		System.out.println(c);
		System.out.println(sb);
	}	
}
*/