package app2;

class Plane
{
	public void takeOff()
	{
		System.out.println("Take off the plane");
	}
	
	public void desc()
	{
		System.out.println("This is plane");
	}
	
	public void height()
	{
		System.out.println("The height of flying is 50ft ");
	}
}

class CargoPlane extends Plane
{
	public void desc()
	{
		System.out.println("This is cargo plane");
	}
	
	public void carry()
	{
		System.out.println("This plane carry Goods");
	}
}

class PassengerPlane extends CargoPlane
{
	public void desc()
	{
		System.out.println("This is passenger plane");
	}
	
	public void carry()
	{
		System.out.println("This plane carry passengers");
	}
	
	public void fun()
	{
		System.out.println("Passenger plane has magzine");
	}
}

class Print
{
	public void disp(Plane p)
	{
		p.takeOff();
		p.desc();
		p.height();
	}
}

public class PolyMorphism 
{
	
	public static void main(String[] args) {
		{
			Plane p = new CargoPlane();
			CargoPlane cp = new CargoPlane();
			PassengerPlane pp = new PassengerPlane();
			
			Print pt = new Print();
			
			pt.disp(p);
			pt.disp(cp);
			pt.disp(pp);			
			
		}
	}

}
