package day_7;

public class Demo {
	Demo()
	{
		System.out.println("hello hi");
	}
	Demo(int x)
	{
		this();
		System.out.println(x);
	}
class TestThis5 {


	public static void main(String[] args) {
		Demo d = new Demo(10);
	}

	}

}
