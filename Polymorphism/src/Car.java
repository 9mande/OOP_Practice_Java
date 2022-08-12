/* Example of Object Polymorphism
 * One Object can have various roles.
 */
public class Car implements FlyingCar, FullGlassCar {
	Tire[] tires = new Tire[] { new Tire(), new Tire(), new Tire(), new Tire() };
	
	@Override
	public void fly(){
		System.out.println("Now flying.");
	}
	
	@Override
	public void land(){
		System.out.println("Now landed.");
	}
	
	@Override
	public void openWindows() {
		System.out.println("Windows are opened.");
	}
	
	@Override
	public void closeWindows() {
		System.out.println("Windows are closed.");
	}
	
	/* Example of Parameter Polymorphism
	 * Tire type variable allows Tire type instance or SamsungTire type instance or WhateverTire type instance to be referenced.
	 */
	public void changeTire(Tire tire, int index) {
		if(index >= 0 && index <= 3)
			tires[index] = tire;
	}
	
	public void go() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
