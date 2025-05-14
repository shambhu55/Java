// Usage 1 : Multiple Inheritance
// by extends keyword we cant achieve multiple inheritance.
// but here we achived Multiple Inheritance by using implements.

class Son implements IndianMother, BritishMother
{
	public void food()
	{
		IndianMother.super.food();
		BritishMother.super.food();
	}
}