class Product
{
	private String name;
	private double price;


// ITS FOR USING SETTER AND GETTER
	public void setName(String name){this.name=name;}
	public void setPrice(double price){this.price=price;}

	public String getName(){return name;}
	public double getPrice(){return price;}

	
// ITS FOR USING CONSTRUCTOR METHOD
	Product(){}

	Product(String name, double price)
	{
		this.name=name;
		this.price=price;
	}

	public String toString()
	{
		return "[PRODUCT NAME : "+name+", PRODUCT PRICE : "+price+"]";
	}
}