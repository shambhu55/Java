class SuperDemo3 extends SuperDemo2
{
	int a=3000;
	void display()
	{
		System.out.println("Display method of SuperDemo3 called");
		System.out.println("a = "+super.a);
		super.display();
	}

	SuperDemo3()
	{
		this(350);
		System.out.println("Default const of SuperDemo3 is called.");
	}

	SuperDemo3(int a)
	{
		
		System.out.println("User-Defined const of SuperDemo3 is called.");
		System.out.println("a = "+a);
	}
}