 package app1;

public class A 
{
	public static void main(String[] args) 
	
	{
//		Integer obj = Integer.valueOf(100);		//wrapping or boxing
//		int i=obj.intValue();								//unboxing
//		System.out.println("done  ::   "+i);
//		A a = new A();
//		System.out.println(a);
//		System.out.println(obj);
//		
//		Integer i1 = Integer.valueOf(100);
//		Integer i2 = Integer.valueOf(100);
//		System.out.println(i1==i2);
//		
//		Integer i3 = Integer.valueOf(10000);
//		Integer i4 = Integer.valueOf(10000);
//		System.out.println(i3==i4);
		
//		Integer obj1 = Integer.valueOf(10);
//		Integer obj2 = Integer.valueOf("10");
//		System.out.println(obj1);
//		System.out.println(obj2);
//		Integer obj3 = Integer.parseInt("2010");
//		System.out.println(obj3);
//		int b=obj3;
//		System.out.println(b);
//		int a=obj2.intValue();
//		System.out.println(a);
//		
//		Double d1 = Double.valueOf(1.4);
//		Double d2 = Double.valueOf("1.4");
//		System.out.println(d1);
//		System.out.println(d2);
//		Double d3 = Double.parseDouble("100.567");
//		System.out.println(d3);
		
		//Character.valueOf("");		is not possible at any case.
		
//		Integer obj1 = Integer.valueOf("10");
//		System.out.println("------------");
//		Integer obj2 = Integer.valueOf("101#");
		
//		Boolean b1 = Boolean.valueOf("true");
//		Boolean b2 = Boolean.valueOf("hello");
//		Boolean b3= Boolean.valueOf(b1);
//		Boolean b4= Boolean.valueOf(b2);
//		Boolean b5 = Boolean.valueOf(false);
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
//		System.out.println(b4);
//		System.out.println(b5);
//		Boolean b6 = Boolean.valueOf("TRUE");
//		System.out.println(b6);
//		
		//int i = Integer.parseInt("10");
		//System.out.println(i);
//		double d= Double.parseDouble("10.34");
//		System.out.println(i+" , "+d);
//		
	//	Long lon1 = Long.valueOf("123L");
//		long lon2 = Long.parseLong("1233l");
//		
//		System.out.println(lon1);
//		System.out.println(lon2);
//		
//		long lon = 1234567788898L;
//		long lon3= 123324899737598l;
		//float f1=1.5;
//		float f2=1.87f;
//		float f3=1.56F;
//		float f4=(float) 234982347349827.48764865658725;
//		//long l = (long)123445894;
//		short s= (short)123767865;
//		short s2=7646;
//		byte b=(byte)1234;
//		System.out.println(f4);
		
//		byte b1=10, b2=30;
//		byte b3= (byte)(b1+b2);		//numeric result always give int result.Need Typecast
//		System.out.println(b3);
		
//		double d1 = 5, d2= 5; int j=100; float f= 2344;
//		double i = d1 + d2 + j + f;
//		System.out.println(i);
//		
		
//		Float f1= Float.valueOf("1.56");
//		System.out.println(f1);
		
		//Float f2= Float.parseFloat("1.54");
		//System.out.println(f2);
		
//		long lon2 = Long.parseLong("1233");
//		int s=lon2;
		
//		int i=Integer.valueOf(1000).intValue();
//		Integer obj=Integer.valueOf(i);
//		i=obj.intValue();
//		System.out.println(obj);
//		System.out.println(i);
//		Integer obj1 = Integer.valueOf(80);
		
//		Integer obj1 = Integer.valueOf(100);
//		Integer obj2 = Integer.valueOf(200);
//		System.out.println(obj2);
//		obj1=obj2;
//		System.out.println(obj1);
//		
//		int i = obj1.intValue();		//explicitly unboxing
//		obj1 = Integer .valueOf(i);	//explicitly boxing
//		
//		i= obj2;
//		obj2 =i;
		
//		Boolean b=Boolean.valueOf(true);
//		boolean b1=b.booleanValue();
//		if(b1)
//		System.out.println(b);
		
		
//		byte var=10;
//		test(var);
		
		
		
//		static void test(byte b)
//		{
//			System.out.println("Byte");
//		}
//		static void test(int b)
//		{
//			System.out.println("int");
//		}
		
//		static void test(Byte n)
//		{
//			System.out.println("BYTE");
//		}
//		static void test(Integer n)
//		{
//			System.out.println("INteger");
//		}
//		static void test(Number n)
//		{
//			System.out.println("Number");
//		}
//		static void test(Object n)
//		{
//			System.out.println("Object");
//		}
//		static void test(byte ... n)
//		{
//			System.out.println("byte...");
//		}
		
		String str="10";
		Double d1=Double.valueOf(str);
		double d=d1.doubleValue();
		//System.out.println(d1);
		System.out.println(d);
		Integer i= Integer.valueOf(12345);
		Double d22= Double.valueOf(i);
		int i1=i.valueOf(i);
		double d212=d22.valueOf(d22);
		System.out.println(i1);
		System.out.println(d212);

//		i=d22;
//		d22=i;
		
	}	
}
/*

			Wrapper Classes																	Primitive Type
			------------------																	------------------
				Byte																							byte
				Short																						short
				Integer																						int
				Long																							long
				Float																							float
				Double																						double
				Character																					char
				Boolean																					boolean
				
	1. 		All wrapper classes are final classes.
	2. 		All wrapper classes are available in java.lang package
	3. 		You can't develop a subclass to any wrapper classes.
	4. 		All wrapper classes is subclass to Comparable Interface.
	5. 		Compare 	objects are allowed to the sorting in the collection framework.
	6. 		All wrapper classes are implementing Serializable interface.
	7. 		Serializable objects only eligible for Serialization.
	8. 		All wrapper classes are get overrided toString() of the object class.
	9. 		toString() is executing while printing a reference variable or in the concatination operation. 
	10.	hashCode() and equals() methods of Objects class got overrided in all wrapper classes.
	11.	hashCode() and equals() methods are used to identify duplicates based on the content in the collection API.
	12.	Wrapper classes are used for--
			1. 		Boxing and Unboxing operations
			2.		Primitive to string and STring to primitive.
	13.	All numeric classes are subclass to Number class.
	14.	One wrapper object can't be converted into another wrapper type.
	15.	There is no support to convert String to char type. No method to convert to String to char in the character wrapper classes.
	16.	Wrapper objects are immutable in some extent. 
	17.	valueOf() method is overloaded in all the wrapper classes except in the character.
			valueOf(primitive type)
			valueOf(String type)
			
			but in the character only one method==> valueOf(primitive type).
	18.	If alphabets or special characters are available while converting a string into numeric, we get number format exception.
	19.	Anything can be converted into boolean. If the content is true(immeterial of the case), then it returns true if content is other then true it will return false.
	20.	Incase of float and double one special character allowed, that is dot.
	21.	letter l or L is not allowed in the String while converting into long type.
	22.	Byte + Byte = int.
	23.	Double + Double = Double
	24.	Lower case f and d and Upper case F and D is allowed in the floating value.
	25.	before JDK 1.5 ==> programmer only should do an explicitly boxing and unboxing.
		 	form JDK 1.5 ==> compiler only doing an automatic boxing and unboxing.
	26.	If suitable method is not there first method preference goes to widening. Then second preference goes to boxing. Third preference
			goes to auto upcasting. Fourth preference goes to Object class i.e. superclass of Number class. Fifth preference goes to byte... .(This type of method called variable number of argument.)
			widening
			boxing
			autoupcasting
			var-args
			
	27.	1. var-arg ==> variable number of arguments.
			2. var-arg should be the last arguments to the methods.
			3. maximum one var-arg allowed to any method.
			4. var-arg is an array by default.
			5. overload a method with an array as an arguments to one method and var-arg as an arguments to another method is not 
				possible.
*/