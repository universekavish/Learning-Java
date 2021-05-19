// two D array list
import java.util.*;
public class twoDarrayList {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList(); // important line, <> contains type of things it contains
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomato");
		produceList.add("zuchini");
		produceList.add("pepper");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		
		System.out.println(groceryList);
//		System.out.println(groceryList.get(0));    // retrieving first list of 2dlist
//		System.out.println(groceryList.get(0).get(0)); // retrieving first of first list of 2dlist
	}
}
