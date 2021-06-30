import java.util.Scanner;

// classes for this class are identified as AnimalDpm
public class DynamicPolymorphism {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		AnimalDpm animal;
		
		System.out.println("What animal do you want");
		System.out.println("1 = dog, 2 = cat :");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal = new DogDpm();
			animal.speak();
		} else if(choice==2) {
			animal = new CatDpm();
			animal.speak();
		} else {
			animal = new AnimalDpm();
			System.out.println("That choice was invalid");
			animal.speak();
		}
		
	}
}
