/*
i/p : Engineer
o/p :
E
En
Eng
Engi
Engin
Engine
Enginee
Engineer

*/

class PrinCharacters
{
	public static void main(String args[])
	{
		String s1 = "Engineer";
		for(int i=0; i<s1.length(); i++)
			System.out.println(s1.substring(0,i+1));
	}
}