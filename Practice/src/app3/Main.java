package app3;

class Animal
{
	
}

class Tiger extends Animal
{
	
}

class Plane
{
	private Animal disp()
	{
		System.out.println("Parent");
		Animal a=new Animal();
		return a;
	}
}

class Cargo extends Plane
{
	public Tiger disp()
	{
		System.out.println("Heilosm");
		Tiger t = new Tiger();
		return t;
	}
}
public class Main {

}
