// overloaded methods
public class overloadedMethods {
	public static void main(String[] args) {
		int x = add(2,3,4,5);
		System.out.println(x);
	}
	
	static int add(int a, int b) {
		System.out.println("method 1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("method 2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("method 3");
		return a + b + c + d;
	}
}
