
public class Challenge2 {

	Challenge2()
	{
		this(19);
		System.out.println("Hello, I'm Default Constructor ");
	}
	Challenge2(int a)
	{	
		this(10,33);
		System.out.println("Hello, I'm Parametrise Constructor with one argument ");
	}
	Challenge2(int a,int b)
	{
		System.out.println("Hello, I'm Parametrise Constructor with two argument ");
	}
	public static void main(String...strings)
	{
		Challenge2 obj1 = new Challenge2();
	}
}
