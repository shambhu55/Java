//ENCAPSULATION
// with constructors

class ConstructorStudent
{
	private int id;
	private String name;
	private String city;
	private double percentage; 	//

	public void setId(int id){this.id=id;}
	public void setName(String name){this.name=name;}
	public void setCity(String city){this.city=city;}
	public void setPercentage(double percentage){this.percentage=percentage;}	//

	public int getId(){return id;}
	public String getName(){return name;}
	public String getCity(){return city;}
	public double getPercentage(){return percentage;}	//

	ConstructorStudent(){}		//

	ConstructorStudent(int id, String name, String city, double percentage)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.percentage=percentage;
	}		//

	public String toString()
	{
		return "[ID: "+id+", NAME: "+name+", CITY: "+city+", PERCENTAGE : "+percentage+"]";
	}
}