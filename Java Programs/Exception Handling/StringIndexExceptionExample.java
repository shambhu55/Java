class StringIndexExceptionExample
{
	public static void main(String args[])
	{
		System.out.println("Program Started");

		String s1 = "India";
		
		try{
		System.out.println(s1.charAt(11));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		System.out.println("Program Ended");
	}
}