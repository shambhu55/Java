/*
STRING CREATION : 
- By using char array[].
*/

class StringCreationByCharArray
{
	public static void main(String args[])
	{
		char c[] = {'I', 'N', 'D', 'I', 'A'};
		String s1 = new String(c);
		System.out.println(s1);
		System.out.println(c);
	}
}
