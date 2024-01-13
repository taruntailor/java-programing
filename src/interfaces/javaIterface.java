package interfaces;
interface Engine {

	float miledge = 10;

	void engineStart(); // by default abstract method

	void engineStop();

	void accelerate();

}
interface GPS {

	void getLocation();

	void navigate();

}
class Car implements Engine {

	@Override
	public void engineStart() {
		System.out.println("Car : Engine start");
	}

	@Override
	public void engineStop() {
		System.out.println("Car : Engine stop");
	}

	@Override
	public void accelerate() {
		System.out.println("Car : Accelerate");
	}

}
class SmartCar implements Engine, GPS {

	@Override
	public void engineStart() {
		System.out.println("Smart-Car : Engine Start");
	}

	@Override
	public void engineStop() {
		System.out.println("Smart-Car : Engine stop");
	}

	@Override
	public void accelerate() {
		System.out.println("Smart-Car : Accelerate");
	}

	@Override
	public void getLocation() {
		System.out.println("Smart-Car : Get Location ");
	}

	@Override
	public void navigate() {
		System.out.println("Smart-Car : Navigate");
	}

}

public class javaIterface {

	public static void main(String[] args) {

		Car ob1 = new Car();
		ob1.engineStart();
		ob1.engineStop();
		ob1.accelerate();

		System.out.println("*****************************");

		SmartCar ob2 = new SmartCar();
		ob2.engineStart();
		ob2.engineStop();
		ob2.accelerate();
		ob2.getLocation();
		ob2.navigate();

	}
}
