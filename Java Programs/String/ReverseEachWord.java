/*
WAP to reverse each word from the String.
i/p : Hello I am Java Debveloper.
o/p : 
*/

class ReverseEachWord
{
	public static void main(String args[])
	{
		String s1 = "Hello I am Java Debveloper";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++){
			String temp = s2[i];
			if(temp.length()!=0)
				sb.append(new StringBuilder(temp).reverse());
				
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}