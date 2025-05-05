class DemoClass implements Demo1, Demo2
{
	public void m3()
	{
		Demo1.m3();
		Demo2.m3();
	}
}