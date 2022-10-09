package app2;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class P
{
	B test()
	{
		return null;
	}
}
class Q extends P
{
	D test()		//return type choosing as sub-class as co-variant. Superclass is not allowed here.
	{
		return null;
	}
}
public class M1 
{

}
