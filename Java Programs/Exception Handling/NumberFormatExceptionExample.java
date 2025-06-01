class NumberFormatExceptionExample
{
	public static void main(String args[])
	{
		System.out.println("Program Started");

		String s1 = " ";
		int check=0;
		try{
		check = Integer.parseInt(s1);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		System.out.println("check : "+check);
		System.out.println("Program Ended");
	}
}