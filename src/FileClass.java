// file class in java
import java.io.File;

public class FileClass {
	public static void main(String[] args) {
		File file = new File("Secret_message.txt");
		
		if(file.exists()) {
			System.out.println("that file exists! :O!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			System.out.println("That file doesn't exist");
		}
	}
}
