/*
WAP to Remove special characters from the strings.
i/o : hello naman,,. where is nikhil?? karthik is lookking for him!!!
o/p : hello naman where is nikhil karthik is lookking for him
*/


class RemoveSpecialCharacter
{
	public static void main(String args[])
	{
		String s1 = "hello naman,,. where is nikhil?? karthik is lookking for him!!!";
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s1.length(); i++){
			char c = s1.charAt(i);
			if(Character.isLetterOrDigit(c) || Character.isWhitespace(c))
				sb.append(c);
		}
		System.out.println(sb);
	}
}

