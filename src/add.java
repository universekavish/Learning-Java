// add method to understand return type
public class add {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		//int z = add(x,y);
		// or System.out.println(z);  
		System.out.println(add(x,y));
	}
	static int add(int x, int y) {
		return x + y;
//		int z = x + y;
//		
//		return z;
	}
}
