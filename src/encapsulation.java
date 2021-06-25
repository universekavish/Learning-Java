// encapsulation
public class encapsulation {
	public static void main(String[] args) {
		encapsulationCar car = new encapsulationCar("Chevrolett","corvette",2021);
	
		
		
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}
}
