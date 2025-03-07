/*

WAP to replace vowels with 1 and 2 alternately.
i/p : International
o/p : 1nt2rn1t21n2l

*/

class ReplaceVowelsWithNum
{
	public static void main(String args[])
	{
		String s1 = "International";
		String s2 = "AEIOUaeiou";
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for(int i=0; i<s1.length(); i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
			{
				if(count%2!=0)
					sb.append(1);
				else
					sb.append(2);
				count++;
			}
			else
				sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	}
}




/*
class ReplaceVowelsWithNum
{
	public static void main(String args[])
	{
		String s1 = "International";
		String s2 = "AEIOUaeiou";
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for(int i=0; i<s1.length(); i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
			{
				if(count==1){
					sb.append(1);
					count=2;
				}
				else{
					sb.append(2);
					count=1;
				}
			}
			else
				sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	}
}
*/