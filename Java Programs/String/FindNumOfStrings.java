/*
WAP to display number of Strings in the Sentences.
i/p : Hello I am Java Developer.
o/p : 5
*/

class FindNumOfStrings
{
	public static void main(String argsp[])
	{
		String s1 = "Hello I am Java Developer.";
		String s2[] = s1.split(" ");
		int count = 0;
		for(int i=0; i<s2.length; i++)
		{
			if(s2[i].length() != 0)
				count++;
		}
		System.out.println(count);
	}
}