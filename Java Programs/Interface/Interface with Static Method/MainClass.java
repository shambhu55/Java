class MainClass
{
	public static void main(String args[])
	{
		// object creation not required as its methods are static.
		Demo1.m1();
		Demo2.m2();
		Demo1.m3();
		Demo2.m3();

		// if we want to create object then have to declare in DemoClass and it is also work as "Demo1.m1"
		DemoClass d1 = new DemoClass();
		d1.m3();
	}
}