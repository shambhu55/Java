package a.b.c.d.e;
public class DemoCloneNotSupported implements Cloneable
{
	public int a,b;
	public void display(){
		System.out.println("a="+a+" b="+b);
	}

	public DemoCloneNotSupported clone(){
		DemoCloneNotSupported d1 = null;
		try{
		d1=(DemoCloneNotSupported)super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e);
		}
		return d1;
	}
}