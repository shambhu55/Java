/*
WAP to find the longest word from the String.
i/p : Welcome to International Airport.
o/p : International
*/

class FindLongestWord
{
	public static void main(String args[])
	{
		String s1 = "Welcome to International Airport.";
		String s2[] = s1.split(" ");
		int size = 0;

		for(int i=0; i<s2.length; i++)
			if(s2[i].length()>size)
				size = s2[i].length();

		for(int i=0; i<s2.length; i++)
			if(size==s2[i].length())
				System.out.println(s2[i]);
	}
}