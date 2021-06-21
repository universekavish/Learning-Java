// object passing
public class objectPassing {
	 public static void main(String[] args) {
		 Garage garage = new Garage();
		 
		 Vehicle car1 = new Vehicle("BMW");
		 Vehicle car2 = new Vehicle("SwiftDezire");
		 
		 garage.park(car1);
		 garage.park(car2);
	 }
}
