/*
WAP to sort words laxicographically
i/p : hello i am java developer
o/p : am developer hello i java

*/

class SortWordsLexicographycally
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[]  = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		java.util.Arrays.sort(s2);

		for(int i=0; i<s2.length; i++){
			sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}

