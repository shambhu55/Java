/*
2.Default Access Specifier
- its used with VARIABLE, METHOD and CLASS.(they are not specified as public, private or protected)
- scope within CLASS and within PACKAGE.(same folder. ex. DefaultASDemo and DefaultASMainClass)
*/

class DefaultASDemo	//default class
{
	int a=10;	//default variable
	
	void display()	//default method
	{
		System.out.println("dispaly method called.");
		System.out.println("a="+a);
	}
}