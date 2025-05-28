/*

WAP to display
i/p : International
o/p : I13n12t11e10r9n8a7t6i5o4n3a2l1

*/


class StringNum
{
	public static void main(String args[])
	{
		String s1 = "International";
		StringBuilder sb = new StringBuilder(s1);
		int count=0;

		for(int i=s1.length()-1; i>=0; i--)
			sb.insert(i+1, ++count);
		System.out.println(sb);
	}
}



