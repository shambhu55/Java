/*

IOException

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class IOException
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