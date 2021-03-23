
public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new Car( 2018, "BMW");
		
		System.out.println("We will now call the accelerate function 5 times");
		
		for( int seconds = 1; seconds <= 5; seconds++) {
			car1.accelerate();
			System.out.println("The current speed is: " + car1.getSpeed());
		}
		
		System.out.println("\nWe will now call the brake function 5 times");
		
		for( int seconds = 1; seconds <= 5; seconds++) {
			car1.brake();
			System.out.println("The current speed is: " + car1.getSpeed());
		}

		System.out.println("\nThe program will end now.");
	}

}
