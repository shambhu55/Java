/*
WAP to display the character in the ascending order
i/p : International
o/p : Iaaeilnnnortt
*/

class AscendingChar
{
	public static void main(String args[])
	{
		String s1 = "International";
		char c[] = s1.toCharArray();
		java.util.Arrays.sort(c);
		System.out.println(c);
	}
}