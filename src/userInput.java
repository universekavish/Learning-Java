// userInput , scanner class
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scanner.nextLine();
		System.out.println("age");
		int age = scanner.nextInt();
		//clearing nextLine();
		scanner.nextLine();
		System.out.println("your food");
		String food = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("you are" + age + "old");
		System.out.println(food);

	}

}
