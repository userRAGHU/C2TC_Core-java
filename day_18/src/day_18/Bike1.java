package day_18;

final class Bike1 {
	void run()
	{
	System.out.println("running");}
	}

class Honda1 extends Bike{
	void run()
	{
	System.out.println("running safely with 100kmph");
	}

	public static void main(String[] args) {
		Honda1 honda= new Honda1();
		honda.run();

	}

}
