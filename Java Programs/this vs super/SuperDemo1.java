class SuperDemo1
{
	int a=10;
	void display()
	{
		System.out.println("Display method of SuperDemo1 called");
		System.out.println("a = "+a);
	}

	SuperDemo1()
	{
		System.out.println("Default const of SuperDemo1 is called.");
	}

	SuperDemo1(int a)
	{
		System.out.println("User-Defined const of SuperDemo1 is called.");
		System.out.println("a = "+a);
	}
}