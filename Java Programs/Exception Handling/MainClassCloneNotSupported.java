import a.b.c.d.e.DemoCloneNotSupported;

class MainClassCloneNotSupported
{
	public static void main(String args[])
	{
		System.out.println("Program Started");

		DemoCloneNotSupported d1 = new DemoCloneNotSupported();
		d1.a=10;
		d1.b=20;
		d1.display();

		DemoCloneNotSupported d2 = d1.clone();
		d2.display();

		System.out.println("Program Ended");
	}
}