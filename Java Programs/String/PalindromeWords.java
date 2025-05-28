
package String;
/*
WAP to find all the palindrome words from string.
i/p : where is nayan and naman karan looking gor him
o/p : nayan
      naman
*/


class PalindromeWords
{
	public static void main(String args[])
	{
		String s1 = "where is nayan and naman karan looking gor him";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			String temp = s2[i];
			if(temp.equalsIgnoreCase(new StringBuilder(temp).reverse().toString()))
				System.out.println(temp);
		}
	}
}


