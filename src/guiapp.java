import javax.swing.JOptionPane;
public class guiapp {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Name");
		JOptionPane.showMessageDialog(null, "hello" + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Age"));				
		JOptionPane.showMessageDialog(null,"age : " + age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("height"));
		JOptionPane.showMessageDialog(null, "height" + height);
		
		
	}

}
