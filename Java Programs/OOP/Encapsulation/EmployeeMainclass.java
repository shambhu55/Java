class EmployeeMainclass
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();

		e1.setEmpId(55);
		e1.setName("Vinit");
		e1.setDept("Finance");
		e1.setSalary(50000);

		System.out.println("Employee Id : "+e1.getEmpId());
		System.out.println("Employee Name : "+e1.getName());
		System.out.println("Employee Department : "+e1.getDept());
		System.out.println("Employee Salary : "+e1.getSalary());

		System.out.println("\n"+"USING CONSTRUCTOR");
		Employee e2 = new Employee(50, "Punit", "Data Handling", 60000);
		System.out.println(e2);
	}
}