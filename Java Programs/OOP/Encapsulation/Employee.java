// ENCAPSULATION 2
//

class Employee
{
	private int empId;
	private String name;
	private String dept;
	private double salary;

	public void setEmpId(int empId){this.empId=empId;}
	public void setName(String name){this.name=name;}
	public void setDept(String dept){this.dept=dept;}
	public void setSalary(double salary){this.salary=salary;}

	public int getEmpId(){return empId;}
	public String getName(){return name;}
	public String getDept(){return dept;}
	public double getSalary(){return salary;}

	Employee(){}	

	Employee(int empId, String name, String dept, double salary)
	{
		this.empId=empId;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}

	public String toString()
	{
		return "[EMP ID : "+empId+", EMP NMAE : "+name+", EMP DEPARTMENT : "+dept+", EMP SALARY : "+salary+"]";
	}
}