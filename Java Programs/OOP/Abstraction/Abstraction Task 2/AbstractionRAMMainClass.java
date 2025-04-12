class AbstractionRAMMainClass
{
	public static void main(String args[])
	{
		AbstractionRAMLaptop l = new AbstractionRAMLaptop();
		l.ram();
		l.configure();

		System.out.println();

		AbstractionRAMMobile m = new AbstractionRAMMobile();
		m.ram();
		m.configure();
	}
}