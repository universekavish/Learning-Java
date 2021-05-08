// logical operators
// && And
// || Or
// ! Not
import java.util.Scanner;
public class logicaloperators {
	public static void main(String[] args) {
//		int temp = 25;
//		if(temp>30) {
//			System.out.println("it is hot outside");
//		} else if(temp>=20 && temp<=30) {
//			System.out.println("it is warm outside");
//		}else {
//			System.out.println("it is cold outside");
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) { 
			System.out.println("you still in da game");
		} else {
			System.out.println("you outta here");
		}
	}
}
