// array of objects
public class arrayOfObjects {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		//Food[] refridgerator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("hotdog");
		
		Food[] refridgerator = {food1, food2, food3};
		
//		refridgerator[0] = food1;
//		refridgerator[1] = food2;
//		refridgerator[2] = food3;
		
		System.out.println(refridgerator[0].name);
		System.out.println(refridgerator[1].name);
		System.out.println(refridgerator[2].name);
	}
}
