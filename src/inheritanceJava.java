// inheritance in java
public class inheritanceJava {
	public static void main(String[] args) {
		inheritCar car = new inheritCar();
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
	}

}
