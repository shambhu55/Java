/*
Exception Handling :
- unwangted condition or situation may occurs during program execution is called as Exception.
- to handling this process we called as exception handling.
- Types :
	- checked exception (Compile time)
	- unchecked exception (Runtime)
*/

class ExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program Started.");

		int a=20;
		int b=10;
		int c=0;
		try{
		c=a/c;		// it gives ArithmeticException.
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("c = "+c);

		System.out.println("Program Ended.");
	}
}