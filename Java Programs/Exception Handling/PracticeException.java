/*	3. IllegalAccessException
// ------------

package a.b.c.d.e;
public class DemoExceptionExample
{
	public int a,b;

	private DemoExceptionExample()
	{
		 System.out.println("Private Constructor Called");
	}

	public void display()
	{
		System.out.println("a="+a+" b="+b);
	}
}

//-----------------------

class PracticeException
{
	public static void main(String args[])
	{
		System.out.println("Program Started.");

		try{
		Class c = Class.forName("a.b.c.d.e.DemoExceptionExample");
		a.b.c.d.e.DemoExceptionExample d1 = (a.b.c.d.e.DemoExceptionExample) c.newInstance();
		d1.a=10;
		d1.b=20;
		d1.display();
		}catch(ClassNotFoundException | InstantiationException |IllegalAccessException e){
			System.out.println(e);
		}
		System.out.println("Program Ended.");
	}
}

*/



/*	2. InstantiationException
// ------------------------------------

abstract class DemoExceptionExample
{
	abstract void m1();
	
}

//--------------

class PracticeException
{
	public static void main(String args[])
	{
		System.out.println("Program Started.");

		try{
		Class c = Class.forName("DemoExceptionExample");
		DemoExceptionExample d1 = (DemoExceptionExample) c.newInstance();
		}catch(ClassNotFoundException | InstantiationException |IllegalAccessException e){
			System.out.println(e);
		}
		System.out.println("Program Ended.");
	}
}

*/



/*	1. ClassNotFoundException
//------------------------------------

class PracticeException
{
	public static void main(String args[])
	{
		System.out.println("Program Started.");

		try{
		Class c = Class.forName("a.b.c.d.e.DemoExceptionExample");
		}catch( ClassNotFoundException e){
			System.out.println(e);
		}

		System.out.println("Program Ended.");
	}
}
*/