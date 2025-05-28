/*

5
4	9
3	8	12
2	7	11	14
1	6	10	13	15

*/

class TriPatternCounter6
{
	public static void main(String args[])
	{
		int n=5;	
		int count=n;		// took count=n as it start with n. 

		for(int i=n; i>=1; i--)		// we need to run loop 5 times(no. of rows are 5)
		{
			int c=count;
			for(int j=n; j>=i; j--)		// need to run i times for each row.
			{
				System.out.print(c+"\t");
				c+=j;		//c=c+j, ex. for 5rd row, 1+5(i=5), 6+4(i=4), 10+3(i=3)...15.
			}
			System.out.println();
			count--;		//coz, first value of each row is decreasing with 1. [5-4-3-2-1]
		}
	}
}
