// Array Declaration

class ArrayDeclaration
{
	public static void main(String args[])
	{
		// Type 1
		int a[]=new int[5];
		a[0]=10;
		a[1]=13;
		a[2]=15;
		a[3]=21;
		a[4]=35;

		// TYPE 2 
		//int a[]={12,23,43,11,33};

		System.out.println("---- In non reverse Order ----");
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"] = " +a[i]);

		System.out.println("---- In reverse Order ----");
		for(int i=a.length-1; i>=0; i--)
			System.out.println("a["+i+"] = " +a[i]);
	}
}