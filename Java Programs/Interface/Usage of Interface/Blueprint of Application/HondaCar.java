// Usage 2 : used as blueprint(Rules) of application

class HondaCar implements Car
{
	int minspeed = 40;

	public void color()
	{
		System.out.println("HondaCar available in all color.");
	}

	public void type()
	{
		System.out.println("HondaCar available in SUV, Sedan, Sports car.");
	}

	public void cc()
	{
		System.out.println("HondaCar available in 1000cc to 2000cc.");
		System.out.println("Minspeed : "+minspeed+", Maxspeed : "+maxspeed);
	}
}