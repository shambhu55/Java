
package String;
/*
WAP to sort each word lexicographically from string. 
i/p : hello i am java developer
o/p : ehllo i am aajv deeeloprv
*/

class SortEachWordLexicographically
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			String temp = s2[i];
			char c[] = temp.toCharArray();

			java.util.Arrays.sort(c);
			sb.append(c);

			if(i<s2.length-1);
				sb.append(" ");
		}
		System.out.println(sb);
	}
}