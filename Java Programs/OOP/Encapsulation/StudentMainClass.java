class StudentMainClass
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("Amit");
		s1.setCity("Pune");
		s1.setPercentage(79.23);

		System.out.println("ID: "+s1.getId());
		System.out.println("NAME: "+s1.getName());
		System.out.println("CITY: "+s1.getCity());
		System.out.println("PERCENTAGE : "+s1.getPercentage());


		Student s2 = new Student();
		s2.setId(10);
		s2.setName("Amit");
		s2.setCity("Pune");
		s2.setPercentage(79.23);

		System.out.println();
		System.out.println("ID: "+s2.getId());
		System.out.println("NAME: "+s2.getName());
		System.out.println("CITY: "+s2.getCity());
		System.out.println("PERCENTAGE : "+s2.getPercentage());


	}
}