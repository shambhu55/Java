class ThisDemo
{
	int a=10;

	void display()
	{
		int a=1000;
		System.out.println(this);	// ThisDemo@28a418fc ...1.with object
		System.out.println("a="+this.a);	// a=10 ...  2.with variable
	}

	ThisDemo()
	{
		this(10);	//User-Defined const of ThisDemo
		System.out.println("Default const of ThisDemo");  //Default const of ThisDemo
	}

	ThisDemo(int a)
	{
		System.out.println("User-Defined const of ThisDemo");
	}
}