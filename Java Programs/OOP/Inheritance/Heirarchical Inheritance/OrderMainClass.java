class OrderMainClass
{
	public static void main(String args[])
	{
	// Using Parent class
	// if we declared object of parent class,
		Orders o = new Zepto();
		System.out.println("packagedFood : "+o.foodDeliveryApp("Bingo")); // then, have to call method of parent class.
		o = new Zomato();
		System.out.println("unpackagedFood : "+o.foodDeliveryApp("Samosa"));


	// OR
	// Using child class
		Zepto zp = new Zepto();
		System.out.println("packagedFood : "+zp.foodDeliveryApp("Bingo"));
		Zomato zm = new Zomato();
		System.out.println("unpackagedFood : "+zm.foodDeliveryApp("Samosa"));

	}
}