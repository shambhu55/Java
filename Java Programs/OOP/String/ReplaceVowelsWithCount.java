/*

WAP to replace vowels with count
i/p : International
o/p : 6nt5rn4t32n1l

*/

class ReplaceVowelsWithCount
{
	public static void main(String args[])
	{
		String s1 = "International";
		StringBuilder sb = new StringBuilder(s1);
		int count = 0;
		String s2 = "AEIOUaeiou";

		for(int i=s1.length()-1; i>=0; i--){
			if(s2.contains(String.valueOf(sb.charAt(i)))){
				sb.deleteCharAt(i);
				sb.insert(i, ++count);
			}
		}
		System.out.println(sb);
	}
}