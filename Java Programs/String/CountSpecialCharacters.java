package String;
/*
WAP to count special characters from the strings.
i/o : hello naman,,. where is nikhil?? karthik is lookking for him!!!
o/p : 8
*/

class CountSpecialCharacters
{
	public static void main(String args[])
	{
		String s1 = "hello naman,,. where is nikhil?? karthik is lookking for him!!!";
		int count = 0;

		for(int i=0; i<s1.length(); i++){
			char c = s1.charAt(i);
			if(!(Character.isLetterOrDigit(c) || Character.isWhitespace(c)))
				count++;
		}
		System.out.println(count);
	}
}
