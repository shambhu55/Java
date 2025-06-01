/*

IOException
------------
- located at java.lang package
- its child class of exception class
- its checked exception
- it occurs when we try to perform io exception, and it wont happen.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class IOExceptionExample
{
	public static void main(String args[])
	{
		System.out.println("Program Started");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int check=0;
		System.out.print("Enter Value : ");
		try{
		check = Integer.parseInt(br.readLine());
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("Value : "+check);

		System.out.println("Program Ended");
	}
}