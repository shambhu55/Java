/*
WAP to Shift First Char Of Each word at End of the String.
i/p : Hello I am Java Debveloper.
o/p : elloH I ma avaJ ebveloperD
*/

class ShiftFirstCharOfEachEnd
{
	public static void main(String args[])
	{
		String s1 = "Hello I am Java Debveloper";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++){
			String temp = s2[i];
			if(temp.length()>1){
				sb.append(temp.substring(1));
				sb.append(temp.charAt(0));
			}
			else
				sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}