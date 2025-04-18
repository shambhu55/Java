class CalculatorMainClass
{
	public static void main(String args[])
	{
		SciFiCalculator c = new SciFiCalculator();
		System.out.println(c.add(10,20));
		System.out.println(c.sub(10,20));
		System.out.println(c.mul(10,20));
		System.out.println(c.div(10,20));
		System.out.println(c.square(5));
		System.out.println(c.squareRoot(25));
		System.out.println(c.cube(5));
		System.out.println(c.cubeRoot(125));
	}
}