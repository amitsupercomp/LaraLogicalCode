package app2;

public class L {
	
	L()
	{
		System.out.println("L()");
	}
	{
		System.out.println("L-IIB");
	}
	
	public static void main(String[] args) {
		L obj= new L();
		
	}

}
// IIB blocks are not available in class file, it only available on java file.


//Constructor Section:- 
//first section is super() or this()

//Second section of the constructor. All IIB block are the second section.

//content of constructor is the third section..