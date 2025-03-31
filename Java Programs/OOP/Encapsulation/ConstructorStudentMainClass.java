class ConstructorStudentMainClass
{
	public static void main(String args[])
	{
		ConstructorStudent s1 = new ConstructorStudent();
		s1.setId(10);
		s1.setName("Amit");
		s1.setCity("Pune");
		s1.setPercentage(79.23);

		System.out.println("\n"+"========= Non CONSTRUCTOR ENCAPSULATION ========="+"\n");
		System.out.println("ID: "+s1.getId());
		System.out.println("NAME: "+s1.getName());
		System.out.println("CITY: "+s1.getCity());
		System.out.println("PERCENTAGE : "+s1.getPercentage());


		ConstructorStudent s2 = new ConstructorStudent();
		s2.setId(20);
		s2.setName("Sumit");
		s2.setCity("Thane");
		s2.setPercentage(88.27);

		System.out.println();
		System.out.println("ID: "+s2.getId());
		System.out.println("NAME: "+s2.getName());
		System.out.println("CITY: "+s2.getCity());
		System.out.println("PERCENTAGE : "+s2.getPercentage());


		System.out.println("\n"+"========= CONSTRUCTOR ENCAPSULATION ========="+"\n");
		ConstructorStudent s3 = new ConstructorStudent(30, "Pranit", "Mumbai", 55.55);
		System.out.println(s3);


/*		System.out.println("\n"+"========= OBJ and CONSTRUCTOR ENCAPSULATION ========="+"\n");
		ConstructorStudent s4 = new ConstructorStudent()
						.setId(20)
						.setName("Anit")
						.setCity("Sangli")
						.setPercentage(66.24);
		System.out.println(s4);
*/
	}
}