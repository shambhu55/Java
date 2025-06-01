/*
1. ClassNotFoundException
---------------------------
- located in java.lang package
- child class of Exception
- its type of checked exception
- occurs when class is not present and we are trying to access that class
*/

class MainClassExceptionExample
{
	public static void main(String args[])
	{
		System.out.println("Program Started.");

		try{
		Class c = Class.forName("a.b.c.d.e.DemoExceptionExample");
		a.b.c.d.e.DemoExceptionExample d1 = (a.b.c.d.e.DemoExceptionExample)c.newInstance();
		d1.a=10;
		d1.b=20;
		d1.display();
		}catch(ClassNotFoundException|InstantiationException|IllegalAccessException e){
			System.out.println(e);
		}
		System.out.println("Program Ended.");
	}
}