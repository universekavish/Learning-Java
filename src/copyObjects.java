// copy objects in java
// using encapsulationCar.java for the same and adding addition copy method
public class copyObjects {
	public static void main(String[] args) {
		encapsulationCar car1 = new encapsulationCar("Chevrolett","Camaro",2021);
//		encapsulationCar car2 = new encapsulationCar("Ford","Mustang",2022);
//		
//		car2.copy(car1);
		encapsulationCar car2 = new encapsulationCar(car1);// for second method of copy constructors
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}
}
