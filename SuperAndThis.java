class Parent
{
	Parent()
	{   this(20);
		System.out.println("This is the Default Constructor of Parent class");
	}
	Parent(int a)
	{
		System.out.println("This is the parametrise Constructor of Parent class");
	}
}

class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("This is the Default Constructor of Child class");
	}
	Child(int b)
	{   this();
		System.out.println("This is the parametrise Constructor of Child class");
	}
}
public class SuperAndThis {
	
	public static void main(String ...strings )
	{
		System.out.println("Starting the Chenning process");
		Child obj = new Child(10);
	}

}
