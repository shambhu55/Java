
/*

AEE	BID	CLC	DNB	EOA
FDI	GHH	HKG	IMF
JCL	KGK	LJJ
MBN	NFM
OAO

1	2	3	4	5
6	7	8	9
10	11	12
13	14
15

5	9	12	14	15
4	8	11	13
3	7	10
2	6
1

5	4	3	2	1
9	8	7	6
12	11	10
14	13
15



class Demo 
{
	public static void main(String args[])
	{
        	int n=5;
		int count1=1;
		int count2=n;
		int count3=n;

        	for (int i1=n, i2=1; i1>=1||i2<=n; i1--,i2++) 
		{
			int c2=count2;
			int c3=count3;
            		for (int j1=1, j2=n, j3=1; j1<=i1||j2>=i2||j3<=i1; j1++,j2--,j3++) 
			{
                    			System.out.print((char)(64+count1++));
                   			System.out.print((char)(64+c2));
					c2+=j2-1;
                   			System.out.print((char)(64+c3));
					c3--;
					System.out.print("\t");
           		}
            		System.out.println();
			count2--;
			count3+=i1-1;
        	}
    	}
}
*/




/*

String s = Hello Naman, Nayan is Waiting...



class Demo
{
	public static void main(String args[])
	{
		String s1 = "Hello naman and Navin, Nayan is Waiting for you...";
		String s2[] = s1.split(" ");

		for(int i=0; i<s2.length; i++){
			
			StringBuilder sb = new StringBuilder(s2[i]);
			
			if(s2[i].toString().equalsIgnoreCase(sb.reverse().toString())){
				System.out.println(s2[i]);
			}
		}
	}
}
*/

/* 
5. Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2" 
*/

// class Demo
// {
// 	public static void main(String args[])
// 	{
// 		String s1= "This is Exercise 1";    
// 		String s2= "This is Exercise 2";

// 		int c = s1.compareTo(s2);
// 		if(c==0)
// 			System.out.println("s1 is equal to s2");
// 		else if(c>0)
// 			System.out.println("s1 is greater than s2");
// 		else
// 			System.out.println("s2 is greater than s1");
		
// 	}
// }


// class Demo
// {
// 	public static void main(String args[])
// 	{
// 		int n=5;

// 		for(int i=1; i<=n; i++){
// 			for(int j=n; j>=1; j--){
// 				if(i<n)
// 					System.out.print(i);
// 				else
// 					System.out.print(j);
// 			}
// 			System.out.println();
// 		}
// 	}
// }























