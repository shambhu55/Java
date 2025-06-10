class SuperDemo2 extends SuperDemo1
{
	int a=30;
	void display()
	{
		System.out.println("Display method of SuperDemo2 called");
		System.out.println("a = "+a);
	}

	SuperDemo2()
	{
		System.out.println("Default const of SuperDemo2 is called.");
	}

	SuperDemo2(int a)
	{
		super(10);
		System.out.println("User-Defined const of SuperDemo2 is called.");
	}
}