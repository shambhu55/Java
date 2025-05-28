/*
WAP to sort words lengthwise.
i/p : hello i am java developer
o/p : i am java hello developer
*/


class SortWordsLengthwise
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[]  = s1.split(" ");
		StringBuilder sb = new StringBuilder();

	//in this the splitted elemengts are sorted.
		for(int i=0; i<s2.length-1; i++)
			for(int j=i+1; j<s2.length; j++)
				if(s2[i].length()>s2[j].length())	// here we swap if length is greater.
				{
					String temp = s2[i];
					s2[i] = s2[j];
					s2[j] = temp;
				}

	// all the sorted elements are in the array, so will add one by one into the StringBuilder(), where we can represent as String at the end.
		for(int i=0; i<s2.length; i++)
		{
			sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}