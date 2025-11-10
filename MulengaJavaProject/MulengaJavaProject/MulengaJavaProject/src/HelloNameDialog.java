import javax.swing.JOptionPane;
public class HelloNameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		result = JOptionPane.showInputDialog(null, "What is youre name?");
		JOptionPane.showMessageDialog(null,  "Hello, " + result + "!");

	}

}
