import java.io.FileWriter;
import java.io.IOException;

//file writers in java

public class FileWritersJava {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("poems.txt");
			writer.write("roses are red \nviolates are blue \ntooty tooty tooty\n rockin' everywhere");
			writer.append("\n(a poem by Kavish)");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
