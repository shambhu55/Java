/*
WAP to sort Digits in the String.
i/p : welcome to 2025
o/p : welcome to 0225
*/

class SortDigitsOfString
{
	public static void main(String args[])
	{
		String s1 = "welcome to 2025";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			if(Character.isDigit(s2[i].charAt(0))){
				char c[] = s2[i].toCharArray();
				java.util.Arrays.sort(c);
				sb.append(c);
			}
			else
				sb.append(s2[i]);

			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}

