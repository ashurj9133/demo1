package name3;

class A{
	String color;
	String name;
	A(String color,String name)
	{
		this.color=color;
		this.name=name;
	}
	void   dog()
	{
		System.out.println("dog color:  "+color);
		System.out.println("dog name:  "+name);
	}
}
class B extends A{
	B(String color, String name)
	{
		super(color,name);
	}
	void   dog()
	{
		System.out.println("dog 1 color:  "+color);
		System.out.println("dog1  name:  "+name);
	}
}

public class Main {

	public static void main(String[] args)  {
		    B s=new B("black","rahul");
		   A b=(A)s;
		   b.dog();
	}

}
