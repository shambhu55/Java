/*
W3 RESOURCE : ARRAY

3. Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - - 

*/

import java.util.Arrays;
class PrintGrid
{
	public static void main(String args[])
	{
		char a[][]=new char[5][5];
 
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++)
				System.out.print(a[i][j]+"-"+"\t");
			System.out.println();
		}
	}
}