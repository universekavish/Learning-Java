// used classses are named like VehiclePm
public class Polymorphism {
	public static void main(String[] args) {
		CarPm car = new CarPm();
		BicyclePm bicycle = new BicyclePm();
		BoatPm boat = new BoatPm();
		
		VehiclePm[] racers = {car,bicycle,boat};// using polymorphism to create an array of diffeerent objects of classes.
		for(VehiclePm x : racers) {
			x.go();
		}
	}
}
