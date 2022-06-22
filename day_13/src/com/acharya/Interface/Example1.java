package com.acharya.Interface;
interface Vehicle1
{
	void Engine();
}
interface Car extends Vehicle1 {
	void getMileage();
}
class Honda implements Car
{
	public void Engine( ) {
		System.out.println("4-Cylinders fuel-injected engine");
	}
	public void getMileage() {
		System.out.println("Mileage is 25 km/L");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Honda car = new Honda();
		car.getMileage();
		car.Engine();

	}

}
