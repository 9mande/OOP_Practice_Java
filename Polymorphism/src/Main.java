
public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.go();
		
		/* Example of Field Polymorphism
		 * Field's type is same (Tire)
		 * But the result varies depending on which object is stored at the field.
		 */
		car.tires[0] = new SamsungTire();
		car.tires[1] = new AppleTire();
		
		car.go();
	}

}
