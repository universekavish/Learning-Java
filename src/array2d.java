// 2d array
public class array2d {
	public static void main(String[] args) {
// another way of declaring
//		String[][] cars = { {"Camaro", "Corvette", "Silverado"},
//							{"hundai", "Corv", "erado"},
//							{"amaro", "vette", "Silver"}
//							};
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		
		cars[1][0] = "hundai";
		cars[1][1] = "Corv";
		cars[1][2] = "erado";
		
		cars[2][0] = "amaro";
		cars[2][1] = "vette";
		cars[2][2] = "Silver";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			
		}
	}
}
