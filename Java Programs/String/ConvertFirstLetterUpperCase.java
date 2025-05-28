package String;
/*
WAP to convert First letter uppercase of each word.
i/p : hello i am java developer
o/p : Hello I Am Java Developer
*/


class ConvertFirstLetterUpperCase
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			sb.append(Character.toUpperCase(s2[i].charAt(0)));
			sb.append(s2[i].substring(1));

			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
