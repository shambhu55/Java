/*

1. Private Access Specifier.
- Scope upto its CLASS ONLY.(means cant access througth MainClass otherwise we get error: display() has private access in PrivateASDemo)
- used with VARIABLE and METHODS.

*/

class PrivateASDemo
{
	private int a=10;	//private variable
	private void display()	//private method
	{
		System.out.println("display method called.");
		System.out.println("a = "+a);
	}

	public static void main(String args[])
	{
		PrivateASDemo d = new PrivateASDemo();	//can access within class only
		d.display();
	}
}
