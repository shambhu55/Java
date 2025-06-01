class ArithmeticExceptionExample
{
	public static void main(String args[])
	{
		System.out.println("Program Started");

		int a=10;
		int b=0;
		int c=0;

		try{
		c=a/b;
		}catch(ArithmeticException e){
			System.out.println(e);
		}

		System.out.println("c = "+c);
		System.out.println("Program Ended");
	}
}