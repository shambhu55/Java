/*
3. Protected Access Specifier
- used with VARIABLE and METHOD.
- WITHIN CLASS, WITHIN package and THROUGH OUT the package.
- for out side package, its achieved by inheritance, so we need its child class and .

*/

class ProtectedASDemo
{
	protected int a=10;
	protected void display()
	{
		int a=30;
		System.out.println("a="+a);	//30
		System.out.println("a="+this.a);	//10
		System.out.println("Display method called.");	
	}
}