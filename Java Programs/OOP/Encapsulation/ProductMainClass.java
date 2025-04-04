class ProductMainClass
{
	public static void main(String args[])
	{
	// ITS FOR USING SETTER AND GETTER
		Product p1 = new Product();

		p1.setName("Tent");
		p1.setPrice(10000);

		System.out.println("Product Name: "+p1.getName());
		System.out.println("Product Price: "+p1.getPrice());


	// ITS FOR USING CONSTRUCTOR METHOD
		System.out.println("\n"+"BY USING CONSTRUCTOR");
		Product p2 = new Product("Camera", 60000);
		System.out.println(p2);

		Product p3 = new Product("Rope", 3000);
		System.out.println(p3);

		Product p4 = new Product("Mini Stove", 2000);
		System.out.println(p2);
	}
}