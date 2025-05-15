// Usage 2 : used as blueprint(Rules) of application

class BMWCar implements Car
{
	int minspeed = 60;

	public void color()
	{
		System.out.println("BMWCar available in White, Black, Grey.");
	}

	public void type()
	{
		System.out.println("BMWCar available in Hatchback, Sedan, Sports car.");
	}

	public void cc()
	{
		System.out.println("BMWCar available in 2000cc to 4000cc.");
		System.out.println("Minspeed : "+minspeed+", Maxspeed : "+maxspeed);
	}
}