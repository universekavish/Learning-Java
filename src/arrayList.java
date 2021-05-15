// Array List
import java.util.ArrayList;
public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Cups");
		food.add("coffee");
		
		food.set(0, "khana"); // setting a new value to index
		food.remove(2); // to remove item at 2
		food.clear(); // clear ArrayList
		
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}
