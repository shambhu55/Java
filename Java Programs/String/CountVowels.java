/*

WAP to display
i/p : International
o/p : 6

*/


// Type : 4
class CountVowels
{
	public static void main(String args[])
	{
		String s1 = "International";
		String s2 = "AEIOUaeiou";
		int count = 0;
		for(int i=0; i<s1.length(); i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
				count++;
		System.out.println(count);
	}
}



/*
// Type : 3
class CountVowels
{
	public static void main(String args[])
	{
		String s1 = "International";
		String s2 = s1.toUpperCase();
		int count = 0;

		for(int i=0; i<s2.length(); i++){
			char c = s2.charAt(i);
			if(c =='A' || c=='E' || c=='I' || c=='O' || c=='U')
				count++;
		}
		System.out.println(count);
	}
}
*/


/*
// Type : 2
class CountVowels
{
	public static void main(String args[])
	{
		String s1 = "International";
		StringBuilder sb = new StringBuilder(s1);
		int count = 0;
		
		for(int i=0; i<s1.length(); i++){
			char c = s1.charAt(i);
			if(c =='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;
		}
		System.out.println(count);
	}
}
*/



/*
// Type : 1
class CountVowels
{
	public static void main(String args[])
	{
		String s1 = "International";
		StringBuilder sb = new StringBuilder(s1);
		int count = 0;

		for(int i=0; i<s1.length(); i++)
			if(s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U' || s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
				count++;
		System.out.println(count);
	}
}
*/