package 연산;

public class Car123Example {

	public static void main(String[] args) {
		Car123 myCar = new Car123();
			myCar.keyTurnOn();
			myCar.run();
			int speed = myCar.getSpeed();
			System.out.println("현재 속도: " + speed + "km/h");
		}
	}