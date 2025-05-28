
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

*/


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

